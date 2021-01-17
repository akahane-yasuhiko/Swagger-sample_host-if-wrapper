package io.swagger;

import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public abstract class AbstTestController extends AbstTest {
  protected final String reqStr = TestUtil.readFile("src/test/resources/" + getId() + "b_request.json");

  @Override
  protected ResultMatcher getMatcherOk() {
    return MockMvcResultMatchers.content().string("{\"statusCode\":null,\"menu\":null}");
  }

  @Override
  protected ResultMatcher getMatcherNg() {
    return MockMvcResultMatchers.content().string("");
  }

  @Override
  protected String getJsonStr() {
    return reqStr;
  }



  @Override
  protected void setMockingOk() {
    // データを書き換えるのでモック不要
  }

  @Override
  protected void setMockingNg() {
    // データを書き換えるのでモック不要
  }

}
