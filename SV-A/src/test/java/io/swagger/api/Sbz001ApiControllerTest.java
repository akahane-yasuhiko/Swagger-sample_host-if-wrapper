//package io.swagger.api;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.Mockito.*;
//import javax.servlet.http.HttpServletRequest;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import io.swagger.model.Sbz001aReq;
//import io.swagger.model.Sbz001aRes;
//import io.swagger.service.Sbz001Service;
//
///* お試しで最初に作った。Sbz002の方ができたらいらない  */
////@RunWith(SpringRunner.class)
////@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
////@AutoConfigureMockMvc
//@ExtendWith(MockitoExtension.class)
//class Sbz001ApiControllerTest {
//
//  @InjectMocks
//  private Sbz001ApiController target;
//
//  @Mock
//  private HttpServletRequest request;
//
////  @MockBean
//  @Mock
//  private Sbz001Service service;
//
//  @Mock
//  private ObjectMapper objectMapper;
//
//  private Sbz001aReq req;
//
//
//  @BeforeEach
//  void beforeEach() {
//
//    // 一度目のinitMocks（@ExtendWith(MockitoExtension.class)で実行）でrequestとobjectMapperにはモックが入るが、serviceに入らない
//    // 二度目のinitMocksでserviceにモックが入るが、requestとobjectMapperのモックが、テストクラスのものとターゲットに入ってるもので別物になってしまう
//    // 一度目のinitMocks（@ExtendWith(MockitoExtension.class)で実行）で作ったrequestとobjectMapperを退避しておいて、二度目のinitMocksの後に復帰させる
//    HttpServletRequest requestBk = this.request;
//    ObjectMapper objectMapperBk = this.objectMapper;
//    MockitoAnnotations.initMocks(this);
//
//    this.request = requestBk;
//    this.objectMapper = objectMapperBk;
//
//    doReturn("application/json").when(request).getHeader(any());
//    doReturn(new Sbz001aRes()).when(service).execute(any());
////  when(request.getHeader(any())).thenReturn("application/json");
////  when(service.execute(any())).thenReturn(new Sbz001aRes());
//
//
//  }
//
//  @Test
//  void test() {
//
//
//    target.sbz001(req);
//
//
//
//    fail("まだ実装されていません");
//  }
//
//}
