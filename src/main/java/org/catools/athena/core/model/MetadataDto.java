package org.catools.athena.core.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MetadataDto implements NameValuePair {

  private Long id;

  @NotBlank(message = "The metadata name must be provided.")
  private String name;

  @NotBlank(message = "The metadata value must be provided.")
  private String value;

  public MetadataDto(String name, String value) {
    this.name = name;
    this.value = value;
  }

}
