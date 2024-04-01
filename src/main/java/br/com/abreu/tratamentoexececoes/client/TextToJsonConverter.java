package br.com.abreu.tratamentoexececoes.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class TextToJsonConverter {

  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static <T> T convertTextToJson(String text, Class<T> responseType) {
    try {
      return objectMapper.readValue(text, responseType);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

}