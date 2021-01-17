package io.swagger;

import org.springframework.test.web.servlet.ResultMatcher;

public abstract class AbstTestService extends AbstTest {

  protected final String resStr = TestUtil.readFile("src/test/resources/" + getId() + "b_response.json");

  @Override
  protected ResultMatcher getMatcherOk() {
    return null;//MockMvcResultMatchers.content().string("{\"statusCode\":null,\"menu\":null}");
  }

  @Override
  protected ResultMatcher getMatcherNg() {
    return null;//MockMvcResultMatchers.content().string("");
  }

  @Override
  protected String getJsonStr() {
    return resStr;
  }

}
