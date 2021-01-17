package io.swagger.service.impl;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import io.swagger.AbstTestService;
import io.swagger.client.sv_b.ApiException;
import io.swagger.client.sv_b.api.SampleBizSvBApi;
import io.swagger.client.sv_b.model.Sbz002bRes0000;
import io.swagger.model.Sbz002aReq;
import io.swagger.service.Sbz002Service;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class Sbz002ServiceImplTest extends AbstTestService {

  @Autowired
  private Sbz002Service service;

//  @MockBean
//  Mapper mapper;

  @MockBean
  SampleBizSvBApi bApi;

  @Override
  protected String getId() {
    return "sbz002";
  }

  @Override
  protected Executable getTargetMethodOk() {
    return () -> service.execute(new Sbz002aReq());// TODO when
  }

  @Override
  protected Executable getTargetMethodNg() {
    return () -> service.execute(new Sbz002aReq());// TODO when
  }


  @BeforeEach
  void beforeEach() throws ApiException {



  }


  @Test
  void test() throws Throwable {

    testMin("statusCode", 4);

    testMax("statusCode", 4);


  }

  @Override
  protected void setMockingOk() {
    try {
      doReturn(new GsonBuilder().create().fromJson(testStr, Sbz002bRes0000.class)).when(bApi).sbz002(any());
    } catch (JsonSyntaxException | ApiException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }

  }

  @Override
  protected void setMockingNg() {
    try {
      doReturn(new GsonBuilder().create().fromJson(testStr, Sbz002bRes0000.class)).when(bApi).sbz002(any());
    } catch (JsonSyntaxException | ApiException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }

  }





}
