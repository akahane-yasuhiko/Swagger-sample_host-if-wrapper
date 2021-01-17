package io.swagger;

import org.junit.jupiter.api.function.Executable;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public abstract class AbstTest {

  protected MockMvc mockMvc;

  protected String testStr;

  protected ResultMatcher matcher;

  protected abstract String getId();
  protected abstract ResultMatcher getMatcherOk();
  protected abstract ResultMatcher getMatcherNg();
  protected abstract void setMockingOk();
  protected abstract void setMockingNg();
  protected abstract Executable getTargetMethodOk();
  protected abstract Executable getTargetMethodNg();
  protected abstract String getJsonStr();

  public void testMin(String itemPath, int min) throws Throwable {
    JsonObject rootObj = getJsonObject(getJsonStr());
    JsonObject targetObj = getTargetObj(rootObj, itemPath);
    String name = getItemName(itemPath);

    // 境界値最小
    targetObj.addProperty(name, TestUtil.getDummyStr(min));
    testStr = rootObj.toString();
    setMockingOk();
    getTargetMethodOk().execute();

    // 境界値最小-1
    targetObj.addProperty(name, TestUtil.getDummyStr(min - 1));
    testStr = rootObj.toString();
    setMockingNg();
    getTargetMethodNg().execute();

  }

  public void testMax(String itemPath, int max) throws Throwable {
    JsonObject rootObj = getJsonObject(getJsonStr());
    JsonObject targetObj = getTargetObj(rootObj, itemPath);
    String name = getItemName(itemPath);

    // 境界値最大
    targetObj.addProperty(name, TestUtil.getDummyStr(max));
    testStr = rootObj.toString();
    setMockingOk();
    getTargetMethodOk().execute();

    // 境界値最大+1
    targetObj.addProperty(name, TestUtil.getDummyStr(max + 1));
    testStr = rootObj.toString();
    setMockingNg();
    getTargetMethodNg().execute();

  }


  public JsonObject getJsonObject(String str) {
    return new GsonBuilder().create().fromJson(str, JsonObject.class);
  }

  public JsonObject getTargetObj(JsonObject rootObj, String objPath) {
    int lastIdx = objPath.lastIndexOf(".");
    if (0 < lastIdx) {
      String objPth = objPath.substring(0, lastIdx);
      return TestUtil.getJsonObjByPath(rootObj, objPth);
    } else {
      return rootObj;
    }

  }

  public String getItemName(String itemPath) {
    return itemPath.substring(itemPath.lastIndexOf(".") + 1);
  }
}
