package br.com.abreu.tratamentoexececoes.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import br.com.abreu.tratamentoexececoes.dto.AdviceDTO;
import br.com.abreu.tratamentoexececoes.service.AdviceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tratamento-erro/v1")
@AllArgsConstructor
public class AdviceController {

  private AdviceService adviceService;

  @GetMapping(value = "/advices",produces = APPLICATION_JSON_VALUE)
  public AdviceDTO getRandomAdvice() {
    return adviceService.getAdvice();
  }

  @GetMapping("/advices/{id}")
  public AdviceDTO getAdviceById(@PathVariable("id")final Integer id) {
    return adviceService.getAdviceById(id);
  }

}