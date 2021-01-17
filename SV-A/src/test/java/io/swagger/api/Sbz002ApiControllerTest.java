package io.swagger.api;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
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
import io.swagger.model.Sbz002aRes;
import io.swagger.service.Sbz002Service;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class Sbz002ApiControllerTest extends AbstTestController {

  @Autowired
  private Sbz002ApiController controller;

  @MockBean
  private Sbz002Service service;

  @Override
  protected String getId() {
    return "sbz002";
  }

  /** 初期化 テスト毎 */
  @BeforeEach
  void beforeEach() {
    mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    doReturn(new Sbz002aRes()).when(service).execute(any());// when(service.execute(any())).thenReturn(new

  }


  @Test
  void test() throws Throwable {

    testMin("reqItem1", 1);
    testMax("reqItem1", 10);

  }

  @Override
  protected Executable getTargetMethodOk() {
    // TODO 自動生成されたメソッド・スタブ
    return () -> mockMvc.perform(post("/" + getId()).contentType(MediaType.APPLICATION_JSON).content(testStr)).andExpect(MockMvcResultMatchers.content().string("{\"statusCode\":null,\"menu\":null}"));
  }

  @Override
  protected Executable getTargetMethodNg() {
    // TODO 自動生成されたメソッド・スタブ
    return () -> mockMvc.perform(post("/" + getId()).contentType(MediaType.APPLICATION_JSON).content(testStr)).andExpect(MockMvcResultMatchers.content().string(""));
  }




}
