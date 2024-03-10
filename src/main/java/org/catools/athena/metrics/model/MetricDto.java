package org.catools.athena.metrics.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.Instant;

@Data
@Accessors(chain = true)
public class MetricDto implements Serializable {

  private Long id;

  @NotBlank(message = "The performance metric duration time must be provided.")
  private Long duration;

  @NotBlank(message = "The performance metric action time must be provided.")
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
  private Instant actionTime;

  @NotNull(message = "The performance metric environment must be provided.")
  private String environment;

  @NotNull(message = "The performance metric project must be provided.")
  private String project;

  @NotNull(message = "The performance metric action must be provided.")
  private ActionDto action;

}
