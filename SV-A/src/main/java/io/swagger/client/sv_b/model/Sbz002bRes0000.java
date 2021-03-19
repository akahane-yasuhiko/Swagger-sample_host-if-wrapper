/*
 * Host-like WEB APIs with Swagger.
 * This is a practice to make host-like WEB APIs with Swagger generated code. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: akahane.yasuhiko@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.sv_b.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.sv_b.model.Menu;
import io.swagger.client.sv_b.model.Sbz002bRes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Sbz002bRes0000
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-19T21:46:58.461691+09:00[Asia/Tokyo]")
public class Sbz002bRes0000 extends Sbz002bRes {
  @SerializedName("menu")
  private Menu menu = null;

  public Sbz002bRes0000 menu(Menu menu) {
    this.menu = menu;
    return this;
  }

   /**
   * Get menu
   * @return menu
  **/
  @Schema(required = true, description = "")
  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz002bRes0000 sbz002bRes0000 = (Sbz002bRes0000) o;
    return Objects.equals(this.menu, sbz002bRes0000.menu) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menu, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz002bRes0000 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
