package io.swagger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.function.Executable;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class TestUtil {

  public static <T> T  jsonStrToObject(String jsonStr, Class<T> clazz) {
    return new GsonBuilder().create().fromJson(jsonStr.toString(), clazz);

  }

//  public static JsonObject getJsonObj(String filename) {
//    return getJsonObjByPath("src/test/resources/" + filename);
//  }
//
//
//  private static JsonObject getJsonObjByPath(String filePath) {
//    return new GsonBuilder().create().fromJson(readFile(filePath), JsonObject.class);
//  }

  public static String readFile(String filePath) {
    try {
      return Files.readString(Paths.get(filePath));
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }

  }

  public static JsonObject getJsonObjByPath(JsonObject obj, String objPath)
      throws JsonSyntaxException {
    String[] seg = objPath.split("\\.");

    for (String element : seg) {
      obj = obj.get(element).getAsJsonObject();
    }

    return obj;
  }

  public static String getDummyStr(int size) {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= size; i++) {
      sb.append(String.valueOf(i % 10));
    }
    return sb.toString();
  }


  public static void testMin(String path, int min, Executable exec, String reqStr) throws Throwable {
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
    exec.execute();

    // 境界値最小-1
    targetObj.addProperty(pmtPth, TestUtil.getDummyStr(min - 1));
    exec.execute();

  }

}
