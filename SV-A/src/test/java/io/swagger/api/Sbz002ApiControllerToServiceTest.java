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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import io.swagger.TestUtil;
import io.swagger.client.sv_b.api.SampleBizSvBApi;
import io.swagger.client.sv_b.model.Sbz002bRes;
import io.swagger.model.Menu;
import io.swagger.model.MenuPopup;
import io.swagger.service.component.MenuBiz;

@SpringBootTest
class Sbz002ApiControllerToServiceTest {

  MockMvc mockMvc;

  @Autowired
  private Sbz002ApiController target;

  // API呼び出しをモック化
  @MockBean // @Autowiredで突っ込むBeanを勝手にMockに差し替えてくれる
  private SampleBizSvBApi apiMock;

  @MockBean // @Autowiredで突っ込むBeanを勝手にMockに差し替えてくれる
  private MenuBiz menuBizMock;

  
  @BeforeEach
  void beforeEach() throws Exception {
    mockMvc = MockMvcBuilders.standaloneSetup(target).build();

  }


  @Test
  void sbz002Test() throws Exception {
    Sbz002bRes sbz002bRes = new Sbz002bRes();
    sbz002bRes.setStatusCode("0000");
    doReturn(sbz002bRes).when(apiMock).sbz002(any());
    
    doReturn(getDummyMenu()).when(menuBizMock).getMenu();

    String reqContent = TestUtil.readFile("src/test/resources/sbz002b_request.json");
    String expect = TestUtil.readFile("src/test/resources/sbz002b_response.json");

    // 順序不一致でもOKになってしまう。。
    mockMvc.perform(post("/sbz002").contentType(MediaType.APPLICATION_JSON).content(reqContent))
        .andExpect(status().isOk()).andExpect(content().json(expect));

  }

  public Menu getDummyMenu() {
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

    return menu;
  }
}
