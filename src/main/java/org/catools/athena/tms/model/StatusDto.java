package org.catools.athena.tms.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.Accessors;
import org.catools.athena.common.markers.IdRequired;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class StatusDto implements Serializable {

  @NotNull(groups = IdRequired.class, message = "The id must be provided.")
  private Long id;

  @NotBlank(message = "The item status code must be provided.")
  @Size(max = 10, message = "The item status code can be at most 10 character.")
  private String code;

  @NotBlank(message = "The item status name must be provided.")
  @Size(max = 50, message = "The item status name can be at most 50 character.")
  private String name;

  public StatusDto(String code, String name) {
    this.code = code;
    this.name = name;
  }

}
