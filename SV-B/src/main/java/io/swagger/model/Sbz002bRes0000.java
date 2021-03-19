package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Menu;
import io.swagger.model.Sbz002bRes;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sbz002bRes0000
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-19T21:32:23.879104+09:00[Asia/Tokyo]")


public class Sbz002bRes0000 extends Sbz002bRes  {
  @JsonProperty("menu")
  private Menu menu = null;

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
    return Objects.equals(this.menu, sbz002bRes0000.menu) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menu, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz002bRes0000 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
