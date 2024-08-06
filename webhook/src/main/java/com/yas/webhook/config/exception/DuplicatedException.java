package com.yas.webhook.config.exception;


import com.yas.webhook.utils.MessagesUtils;

public class DuplicatedException extends RuntimeException {

  private String message;

  public DuplicatedException(String errorCode, Object... var2) {
    this.message = MessagesUtils.getMessage(errorCode, var2);
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
