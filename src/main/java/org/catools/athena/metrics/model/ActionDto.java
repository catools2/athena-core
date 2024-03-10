package org.catools.athena.metrics.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ActionDto {

  private Long id;

  @NotBlank(message = "The action name must be provided.")
  private String name;

  @NotBlank(message = "The action target must be provided.")
  private String target;

  @NotBlank(message = "The action target must be provided.")
  private String type;

  @NotBlank(message = "The action command must be provided.")
  private String command;

  @NotBlank(message = "The action parameter must be provided.")
  private String parameter;

}
