package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sbz003cRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-19T21:32:11.200249+09:00[Asia/Tokyo]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "statusCode", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = Sbz003cRes0000.class, name = "0000"),
        @JsonSubTypes.Type(value = Sbz003cRes2001.class, name = "2001"),
        @JsonSubTypes.Type(value = Sbz003cRes2002.class, name = "2002"),
        @JsonSubTypes.Type(value = Sbz003cRes9999.class, name = "9999"),
})


public class Sbz003cRes   {
  @JsonTypeId
  private String statusCode = null;

  public Sbz003cRes statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

  @Size(min=4,max=4)   public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz003cRes sbz003cRes = (Sbz003cRes) o;
    return Objects.equals(this.statusCode, sbz003cRes.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz003cRes {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
