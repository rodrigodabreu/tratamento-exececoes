package br.com.abreu.tratamentoexececoes.service;

import br.com.abreu.tratamentoexececoes.client.AdviceClient;
import br.com.abreu.tratamentoexececoes.dto.AdviceDTO;
import br.com.abreu.tratamentoexececoes.exceptions.AdviceNotFoundException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdviceService {

  private AdviceClient client;

  public AdviceDTO getAdvice() {
    try {
      String responseText = client.getAdvice();

      ObjectMapper objectMapper = new ObjectMapper();
      try {
        return objectMapper.readValue(responseText, AdviceDTO.class);
      } catch (Exception e) {
        // Lidar com exceções de conversão, se necessário
        e.printStackTrace();
        return null;
      }
    } catch (AdviceNotFoundException ex) {
      throw new AdviceNotFoundException();
    }
  }

  public AdviceDTO getAdviceById(final Integer id) {
    try {
      String responseText = client.getAdviceById(id);

      ObjectMapper objectMapper = new ObjectMapper();
      try {
        return objectMapper.readValue(responseText, AdviceDTO.class);
      } catch (Exception e) {
        e.printStackTrace();
        return null;
      }
    } catch (AdviceNotFoundException ex) {
      throw new AdviceNotFoundException();
    }
  }

}