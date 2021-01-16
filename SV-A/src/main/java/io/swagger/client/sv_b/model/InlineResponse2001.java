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
/**
 * InlineResponse2001
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-01T02:23:55.991Z[GMT]")

public class InlineResponse2001 implements OneOfinlineResponse2001 {
  public InlineResponse2001() {
      // XXX
//    this.statusCode = this.getClass().getSimpleName();
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");

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
