package io.swagger.api;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import javax.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import io.swagger.TestUtil;
import io.swagger.model.Sbz002aReq;
import io.swagger.model.Sbz002aRes;
import io.swagger.service.Sbz002Service;

@ExtendWith(MockitoExtension.class)
class Sbz002ApiControllerTestMockito {

  private Executable targetMthod;

  @InjectMocks
  private Sbz002ApiController targetObj;

  @Mock
  private HttpServletRequest request;

  @Mock
  private Sbz002Service service;

  @Mock
  private ObjectMapper objectMapper;

  private Sbz002aReq req;


  private static String reqStr;

  private static String resStr;

  @BeforeAll
  static void beforeAll() {
    reqStr = TestUtil.readFile("src/test/resources/sbz002b_request.json");
    resStr = TestUtil.readFile("src/test/resources/sbz002b_response.json");
  }


  @BeforeEach
  void beforeEach() {
    // モックの初期化（退避＆復帰）
    // ※ハマったメモ
    // 一度目のinitMocks（@ExtendWith(MockitoExtension.class)で実行）でthisとtargetにrequestとobjectMapperにはモックが入るが、serviceに入らない
    // 二度目のinitMocksでthisとtargetにserviceにモックが入るが、requestとobjectMapperはthisだけ更新されてtargetの方は更新されない。（thisとtargetで別物を参照してしまう⇒thisでwhenを設定してもtargetは別物を見てるので効かない）
    // 一度目のinitMocks（@ExtendWith(MockitoExtension.class)で実行）で作ったrequestとobjectMapperを退避しておいて、二度目のinitMocksの後にthisに復帰させる
    HttpServletRequest requestBk = this.request;
    ObjectMapper objectMapperBk = this.objectMapper;

    MockitoAnnotations.initMocks(this);

    this.request = requestBk;
    this.objectMapper = objectMapperBk;


    // モックの動作を設定
    doReturn("application/json").when(request).getHeader(any());// when(request.getHeader(any())).thenReturn("application/json");
    doReturn(new Sbz002aRes()).when(service).execute(any());// when(service.execute(any())).thenReturn(new


    // ターゲットメソッドを設定。
    targetMthod = () -> targetObj.sbz002(req);

    BindingResult br = new DataBinder(req).getBindingResult();

  }


  @Test
  void test() {

    // assertThrows(Exception.class, ()->target.sbz002(req));
    // target.sbz002(req);

    testMin("reqItem1", 1);



    fail("まだ実装されていません");
  }


  public void testMin(String path, int min) {
    JsonObject rootObj = new GsonBuilder().create().fromJson(reqStr, JsonObject.class);
    JsonObject targetObj = rootObj;
    System.out.println(rootObj);


    int lastIdx = path.lastIndexOf(".");
    String pmtPth = path.substring(lastIdx + 1);

    if (0 < lastIdx) {
      String objPth = path.substring(0, lastIdx);
      targetObj = TestUtil.getJsonObjByPath(rootObj, objPth);
    }

    // 境界値最小
    targetObj.addProperty(pmtPth, TestUtil.getDummyStr(min));
    System.out.println(rootObj);
    req = new GsonBuilder().create().fromJson(rootObj.toString(), Sbz002aReq.class);
    try {
      targetMthod.execute();
    } catch (Throwable e) {
      fail("境界値で例外スロー");
    }

    // 境界値最小-1
    targetObj.addProperty(pmtPth, TestUtil.getDummyStr(min - 1));
    System.out.println(rootObj);
    req = new GsonBuilder().create().fromJson(rootObj.toString(), Sbz002aReq.class);
    assertThrows(Exception.class, targetMthod);

  }

}
