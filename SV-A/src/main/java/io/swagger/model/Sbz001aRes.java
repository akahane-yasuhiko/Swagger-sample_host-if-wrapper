package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sbz001aRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-29T06:09:07.235Z[GMT]")


public class Sbz001aRes   {
  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("resItem1")
  private String resItem1 = null;

  public Sbz001aRes statusCode(String statusCode) {
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

  public Sbz001aRes resItem1(String resItem1) {
    this.resItem1 = resItem1;
    return this;
  }

  /**
   * Get resItem1
   * @return resItem1
   **/
  @Schema(example = "X000", description = "")
  
  @Size(min=4,max=4)   public String getResItem1() {
    return resItem1;
  }

  public void setResItem1(String resItem1) {
    this.resItem1 = resItem1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz001aRes sbz001aRes = (Sbz001aRes) o;
    return Objects.equals(this.statusCode, sbz001aRes.statusCode) &&
        Objects.equals(this.resItem1, sbz001aRes.resItem1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, resItem1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz001aRes {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    resItem1: ").append(toIndentedString(resItem1)).append("\n");
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
