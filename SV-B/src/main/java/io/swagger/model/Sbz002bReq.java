package io.swagger.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Sbz002bReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-20T08:49:44.071Z[GMT]")


public class Sbz002bReq   {
  @JsonProperty("reqItem1")
  private String reqItem1 = null;

  public Sbz002bReq reqItem1(String reqItem1) {
    this.reqItem1 = reqItem1;
    return this;
  }

  /**
   * Get reqItem1
   * @return reqItem1
   **/
  @Schema(example = "fuga", required = true, description = "")
      @NotNull

  @Size(min=1,max=10)   public String getReqItem1() {
    return reqItem1;
  }

  public void setReqItem1(String reqItem1) {
    this.reqItem1 = reqItem1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz002bReq sbz002bReq = (Sbz002bReq) o;
    return Objects.equals(this.reqItem1, sbz002bReq.reqItem1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reqItem1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz002bReq {\n");

    sb.append("    reqItem1: ").append(toIndentedString(reqItem1)).append("\n");
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
