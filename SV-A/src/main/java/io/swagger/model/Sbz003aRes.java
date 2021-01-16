package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sbz003aRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-29T06:09:07.235Z[GMT]")


public class Sbz003aRes   {
  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("resItem1")
  private String resItem1 = null;

  @JsonProperty("resItem2")
  private String resItem2 = null;

  public Sbz003aRes statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
   **/
  @Schema(example = "0000", required = true, description = "")
      @NotNull

  @Size(min=4,max=4)   public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public Sbz003aRes resItem1(String resItem1) {
    this.resItem1 = resItem1;
    return this;
  }

  /**
   * Get resItem1
   * @return resItem1
   **/
  @Schema(example = "xx123", description = "")
  
  @Size(min=5,max=5)   public String getResItem1() {
    return resItem1;
  }

  public void setResItem1(String resItem1) {
    this.resItem1 = resItem1;
  }

  public Sbz003aRes resItem2(String resItem2) {
    this.resItem2 = resItem2;
    return this;
  }

  /**
   * Get resItem2
   * @return resItem2
   **/
  @Schema(example = "XXXX9999", description = "")
  
  @Size(min=8,max=8)   public String getResItem2() {
    return resItem2;
  }

  public void setResItem2(String resItem2) {
    this.resItem2 = resItem2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz003aRes sbz003aRes = (Sbz003aRes) o;
    return Objects.equals(this.statusCode, sbz003aRes.statusCode) &&
        Objects.equals(this.resItem1, sbz003aRes.resItem1) &&
        Objects.equals(this.resItem2, sbz003aRes.resItem2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, resItem1, resItem2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz003aRes {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    resItem1: ").append(toIndentedString(resItem1)).append("\n");
    sb.append("    resItem2: ").append(toIndentedString(resItem2)).append("\n");
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
