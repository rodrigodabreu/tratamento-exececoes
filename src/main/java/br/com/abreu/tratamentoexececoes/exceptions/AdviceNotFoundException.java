package br.com.abreu.tratamentoexececoes.exceptions;

public class AdviceNotFoundException extends RuntimeException{

  public AdviceNotFoundException() {
    super("Advice not found");
  }

  public AdviceNotFoundException(String message) {
    super(message);
  }
}