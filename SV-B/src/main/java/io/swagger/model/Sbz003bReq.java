package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sbz003bReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-19T21:32:23.879104+09:00[Asia/Tokyo]")


public class Sbz003bReq   {
  @JsonProperty("reqItem1")
  private String reqItem1 = null;

  public Sbz003bReq reqItem1(String reqItem1) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz003bReq sbz003bReq = (Sbz003bReq) o;
    return Objects.equals(this.reqItem1, sbz003bReq.reqItem1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reqItem1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz003bReq {\n");
    
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
