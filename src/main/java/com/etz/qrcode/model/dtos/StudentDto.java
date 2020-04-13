package com.etz.qrcode.model.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.validation.constraints.Email;
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
public class StudentDto {

    @NotBlank(message = "Department name cannot be empty")
    private String firstName;

    @NotBlank(message = "Department name cannot be empty")
    private String lastName;

    @NotNull(message = "Department name cannot be empty")
    private long departmentId;

    @NotBlank(message = "Department name cannot be empty")
    @Email(message = "Must be a valid email")
    private String email;

    @NotBlank(message = "Department name cannot be empty")
    private String mobile;

    @NotBlank(message = "Department name cannot be empty")
    private String dob;

    @NotBlank(message = "Matric number cannot be empty")
    private String matricNumber;
}
