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

  @NotBlank(message = "The action category must be provided.")
  private String category;

  @NotBlank(message = "The action target must be provided.")
  private String target;

  @NotBlank(message = "The action target must be provided.")
  private String type;

  @NotBlank(message = "The action command must be provided.")
  private String command;

  private String parameter;

}
