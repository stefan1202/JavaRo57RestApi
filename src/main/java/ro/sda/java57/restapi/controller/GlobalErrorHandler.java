package ro.sda.java57.restapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ro.sda.java57.restapi.exceptions.SdaException;

@ControllerAdvice
@ResponseBody // or @RestControllerAdvice
@Slf4j
public class GlobalErrorHandler {

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(SdaException.class)
  public Error handleSdaException(final SdaException exception) {
    log.debug("something bad has happened...");
    return new Error(exception.getMessage());
  }
}