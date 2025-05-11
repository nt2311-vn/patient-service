package com.pm.patient_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
  @NotBlank
  @Size(max = 100, message = "Name cannot exceed 100 characters")
  private String name;

  @NotBlank
  @Email(message = "Email should be valid")
  private String email;
}
