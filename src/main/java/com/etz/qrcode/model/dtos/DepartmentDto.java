package com.etz.qrcode.model.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author ajao temitayo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DepartmentDto {

    @NotBlank(message = "Department name cannot be empty")
    private String name;

    @NotNull(message = "Department fee cannot be empty")
    private long fee;
}
