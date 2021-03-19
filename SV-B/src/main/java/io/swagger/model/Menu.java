package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MenuPopup;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Menu
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-19T21:32:23.879104+09:00[Asia/Tokyo]")


public class Menu   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("popup")
  @Valid
  private List<MenuPopup> popup = null;

  public Menu id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "m0001", required = true, description = "")
      @NotNull

  @Size(min=5,max=5)   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Menu value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(example = "File", required = true, description = "")
      @NotNull

  @Size(max=20)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Menu popup(List<MenuPopup> popup) {
    this.popup = popup;
    return this;
  }

  public Menu addPopupItem(MenuPopup popupItem) {
    if (this.popup == null) {
      this.popup = new ArrayList<MenuPopup>();
    }
    this.popup.add(popupItem);
    return this;
  }

  /**
   * Get popup
   * @return popup
   **/
  @Schema(description = "")
      @Valid
    public List<MenuPopup> getPopup() {
    return popup;
  }

  public void setPopup(List<MenuPopup> popup) {
    this.popup = popup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menu menu = (Menu) o;
    return Objects.equals(this.id, menu.id) &&
        Objects.equals(this.value, menu.value) &&
        Objects.equals(this.popup, menu.popup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, popup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menu {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    popup: ").append(toIndentedString(popup)).append("\n");
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
