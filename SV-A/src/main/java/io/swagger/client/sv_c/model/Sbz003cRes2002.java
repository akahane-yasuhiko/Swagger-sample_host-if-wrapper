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

package io.swagger.client.sv_c.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.client.sv_c.model.Sbz003cRes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Sbz003cRes2002
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-01T02:13:18.647Z[GMT]")
public class Sbz003cRes2002 extends Sbz003cRes implements OneOfinlineResponse200 {
  @SerializedName("resItem2002")
  private String resItem2002 = null;

  public Sbz003cRes2002 resItem2002(String resItem2002) {
    this.resItem2002 = resItem2002;
    return this;
  }

   /**
   * Get resItem2002
   * @return resItem2002
  **/
  @Schema(example = "ABCDEF", required = true, description = "")
  public String getResItem2002() {
    return resItem2002;
  }

  public void setResItem2002(String resItem2002) {
    this.resItem2002 = resItem2002;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz003cRes2002 sbz003cRes2002 = (Sbz003cRes2002) o;
    return Objects.equals(this.resItem2002, sbz003cRes2002.resItem2002) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resItem2002, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz003cRes2002 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resItem2002: ").append(toIndentedString(resItem2002)).append("\n");
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
