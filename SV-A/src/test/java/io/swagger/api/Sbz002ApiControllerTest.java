package io.swagger.api;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import io.swagger.AbstTestController;
import io.swagger.TestUtil;
import io.swagger.model.Menu;
import io.swagger.model.MenuPopup;
import io.swagger.model.Sbz002aRes;
import io.swagger.service.Sbz002Service;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class Sbz002ApiControllerTest extends AbstTestController {

  @Autowired
  private Sbz002ApiController target;

  @MockBean
  private Sbz002Service serviceMock;

  @Override
  protected String getId() {
    return "sbz002";
  }

  /** 初期化 テスト毎 */
  @BeforeEach
  void beforeEach() {
    mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    doReturn(new Sbz002aRes()).when(serviceMock).execute(any());// when(service.execute(any())).thenReturn(new

  }


  @Test
  void test() throws Throwable {

    testMin("reqItem1", 1);
    testMax("reqItem1", 10);

  }

  @Test
  void sbz002Test() throws Exception {
    List<MenuPopup> popupList = new ArrayList<MenuPopup>();
    MenuPopup popup1 = new MenuPopup();
    popup1.setOnclick("CreateNewDoc()");
    popup1.setValue("New");
    popupList.add(popup1);

    MenuPopup popup2 = new MenuPopup();
    popup2.setOnclick("CloseDoc()");
    popup2.setValue("Close");
    popupList.add(popup2);

    MenuPopup popup3 = new MenuPopup();
    popup3.setOnclick("OpenDoc()");
    popup3.setValue("Open");
    popupList.add(popup3);

    Menu menu = new Menu();
    menu.setId("m0001");
    menu.setPopup(popupList);
    menu.setValue("File");

    Sbz002aRes sbz002aRes = new Sbz002aRes();
    sbz002aRes.setMenu(menu);
    sbz002aRes.setStatusCode("0000");

    doReturn(sbz002aRes).when(serviceMock).execute(any());
    
    String reqContent = TestUtil.readFile("src/test/resources/sbz002b_request.json");
    String expect = TestUtil.readFile("src/test/resources/sbz002b_response.json");

//  MvcResult result =
//  mockMvc.perform(post("/sbz002").contentType(MediaType.APPLICATION_JSON).content(reqContent))
//  .andReturn();
//  String act = result.getResponse().getContentAsString();
//  System.out.println(act);
    
    // 順序不一致でもOKになってしまう。。
    mockMvc.perform(post("/sbz002").contentType(MediaType.APPLICATION_JSON).content(reqContent))
        .andExpect(status().isOk())
        .andExpect(content().json(expect));

  }


  @Override
  protected Executable getTargetMethodOk() {
    return () -> mockMvc
        .perform(post("/" + getId()).contentType(MediaType.APPLICATION_JSON).content(testStr))
        .andExpect(MockMvcResultMatchers.content().string("{\"statusCode\":null,\"menu\":null}"));
  }

  @Override
  protected Executable getTargetMethodNg() {
    return () -> mockMvc
        .perform(post("/" + getId()).contentType(MediaType.APPLICATION_JSON).content(testStr))
        .andExpect(MockMvcResultMatchers.content().string(""));
  }



}
