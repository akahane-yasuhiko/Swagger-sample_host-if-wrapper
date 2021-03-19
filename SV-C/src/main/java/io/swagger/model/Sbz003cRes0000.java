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
 * Sbz003cRes0000
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-19T21:32:11.200249+09:00[Asia/Tokyo]")


public class Sbz003cRes0000 extends Sbz003cRes  {
  @JsonProperty("resItem1")
  private String resItem1 = null;

  public Sbz003cRes0000 resItem1(String resItem1) {
    this.resItem1 = resItem1;
    return this;
  }

  /**
   * Get resItem1
   * @return resItem1
   **/
  @Schema(example = "hoge fuga hoga", required = true, description = "")
      @NotNull

  @Size(min=1,max=255)   public String getResItem1() {
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
    Sbz003cRes0000 sbz003cRes0000 = (Sbz003cRes0000) o;
    return Objects.equals(this.resItem1, sbz003cRes0000.resItem1) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resItem1, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz003cRes0000 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
