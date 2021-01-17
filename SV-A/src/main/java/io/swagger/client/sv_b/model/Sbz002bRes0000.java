package io.swagger.client.sv_b.model;

import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.model.Menu;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Sbz002bRes0000
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-16T02:28:43.259Z[GMT]")


public class Sbz002bRes0000 extends InlineResponse200 implements OneOfinlineResponse200 {
  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("menu")
  private Menu menu = null;

  public Sbz002bRes0000 statusCode(String statusCode) {
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

  public Sbz002bRes0000 menu(Menu menu) {
    this.menu = menu;
    return this;
  }

  /**
   * Get menu
   * @return menu
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz002bRes0000 sbz002bRes0000 = (Sbz002bRes0000) o;
    return Objects.equals(this.statusCode, sbz002bRes0000.statusCode) &&
        Objects.equals(this.menu, sbz002bRes0000.menu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, menu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz002bRes0000 {\n");

    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
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
