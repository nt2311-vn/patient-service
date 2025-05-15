package com.pm.patient_service.exception;

/** EmailAlreadyExistsException */
public class EmailAlreadyExistsException extends RuntimeException {

  public EmailAlreadyExistsException(String message) {
    super(message);
  }
}
