package io.swagger.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-01T02:13:34.932Z[GMT]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "statusCode", visible = true )
@JsonSubTypes({
        @JsonSubTypes.Type(value = Sbz003cRes2001.class, name = "2001"),
        @JsonSubTypes.Type(value = Sbz003cRes2002.class, name = "2002"),
        @JsonSubTypes.Type(value = Sbz003cRes9999.class, name = "9999"),
        @JsonSubTypes.Type(value = Sbz003cRes0000.class, name = "0000"),
})


public class InlineResponse200  implements OneOfinlineResponse200 {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");

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
