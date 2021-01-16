package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Menu;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sbz002aRes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-16T03:19:17.483Z[GMT]")


public class Sbz002aRes   {
  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("menu")
  private Menu menu = null;

  public Sbz002aRes statusCode(String statusCode) {
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

  public Sbz002aRes menu(Menu menu) {
    this.menu = menu;
    return this;
  }

  /**
   * Get menu
   * @return menu
   **/
  @Schema(description = "")
  
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
    Sbz002aRes sbz002aRes = (Sbz002aRes) o;
    return Objects.equals(this.statusCode, sbz002aRes.statusCode) &&
        Objects.equals(this.menu, sbz002aRes.menu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, menu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz002aRes {\n");
    
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
