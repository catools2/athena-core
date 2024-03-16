package org.catools.athena.tms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;


@Data
@Accessors(chain = true)
public class TestCycleDto implements Serializable {

  private Long id;

  @NotBlank(message = "The cycle name must be provided.")
  @Size(max = 300, message = "The cycle name can be at most 300 character.")
  private String code;

  @Size(min=64, max = 64, message = "The cycle sha256 should be 64 character.")
  @NotNull(message = "The cycle sha256 must be provided.")
  private String sha256;

  @NotNull(message = "The cycle start date/time must be provided.")
  private String name;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
  private Instant startDate;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
  private Instant endDate;

  private String version;

  private Set<TestExecutionDto> testExecutions = new HashSet<>();

}
