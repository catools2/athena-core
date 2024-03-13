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
import java.util.UUID;


@Data
@Accessors(chain = true)
public class TestCycleDto implements Serializable {

  private Long id;

  @NotBlank(message = "The cycle name must be provided.")
  @Size(max = 300, message = "The cycle name can be at most 300 character.")
  private String code;

  @NotNull(message = "The cycle hash must be provided.")
  private Integer uniqueHash;

  @NotNull(message = "The cycle start date/time must be provided.")
  private String name;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
  private Instant startDate;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "UTC")
  private Instant endDate;

  private String version;

  private Set<TestExecutionDto> testExecutions = new HashSet<>();

}
