package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Sbz003cRes;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sbz003cRes2001
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-19T21:32:11.200249+09:00[Asia/Tokyo]")


public class Sbz003cRes2001 extends Sbz003cRes  {
  @JsonProperty("resItem2001")
  private String resItem2001 = null;

  public Sbz003cRes2001 resItem2001(String resItem2001) {
    this.resItem2001 = resItem2001;
    return this;
  }

  /**
   * Get resItem2001
   * @return resItem2001
   **/
  @Schema(example = "ABCDE", required = true, description = "")
      @NotNull

  @Size(min=5,max=5)   public String getResItem2001() {
    return resItem2001;
  }

  public void setResItem2001(String resItem2001) {
    this.resItem2001 = resItem2001;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz003cRes2001 sbz003cRes2001 = (Sbz003cRes2001) o;
    return Objects.equals(this.resItem2001, sbz003cRes2001.resItem2001) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resItem2001, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz003cRes2001 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resItem2001: ").append(toIndentedString(resItem2001)).append("\n");
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
