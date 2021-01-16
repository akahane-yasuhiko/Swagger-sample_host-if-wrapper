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
 * Sbz003cRes2002
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-20T09:38:05.686Z[GMT]")


public class Sbz003cRes2002 extends Sbz003cRes implements OneOfinlineResponse200 {
  @JsonProperty("resItem2002")
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
      @NotNull

  @Size(min=6,max=6)   public String getResItem2002() {
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
