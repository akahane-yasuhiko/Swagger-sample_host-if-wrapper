package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sbz003aReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-29T06:09:07.235Z[GMT]")


public class Sbz003aReq   {
  @JsonProperty("reqItem1")
  private String reqItem1 = null;

  @JsonProperty("reqItem2")
  private String reqItem2 = null;

  public Sbz003aReq reqItem1(String reqItem1) {
    this.reqItem1 = reqItem1;
    return this;
  }

  /**
   * Get reqItem1
   * @return reqItem1
   **/
  @Schema(example = "hoga", required = true, description = "")
      @NotNull

  @Size(min=1,max=10)   public String getReqItem1() {
    return reqItem1;
  }

  public void setReqItem1(String reqItem1) {
    this.reqItem1 = reqItem1;
  }

  public Sbz003aReq reqItem2(String reqItem2) {
    this.reqItem2 = reqItem2;
    return this;
  }

  /**
   * Get reqItem2
   * @return reqItem2
   **/
  @Schema(example = "XXXX0000", required = true, description = "")
      @NotNull

  @Size(min=8,max=8)   public String getReqItem2() {
    return reqItem2;
  }

  public void setReqItem2(String reqItem2) {
    this.reqItem2 = reqItem2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz003aReq sbz003aReq = (Sbz003aReq) o;
    return Objects.equals(this.reqItem1, sbz003aReq.reqItem1) &&
        Objects.equals(this.reqItem2, sbz003aReq.reqItem2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reqItem1, reqItem2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz003aReq {\n");
    
    sb.append("    reqItem1: ").append(toIndentedString(reqItem1)).append("\n");
    sb.append("    reqItem2: ").append(toIndentedString(reqItem2)).append("\n");
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
