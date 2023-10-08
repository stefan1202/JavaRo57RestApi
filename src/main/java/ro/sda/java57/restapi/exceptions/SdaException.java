package ro.sda.java57.restapi.exceptions;

public class SdaException extends RuntimeException {
  public SdaException(final String message) {
    super(message);
  }
}