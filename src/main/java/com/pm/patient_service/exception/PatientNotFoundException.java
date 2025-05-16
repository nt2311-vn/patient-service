package com.pm.patient_service.exception;

/** PatientNotFoundException */
public class PatientNotFoundException extends RuntimeException {
  public PatientNotFoundException(String message) {
    super(message);
  }
}
