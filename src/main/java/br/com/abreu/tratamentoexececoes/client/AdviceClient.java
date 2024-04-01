package br.com.abreu.tratamentoexececoes.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${advice.client.name}", url = "${advice.client.url}")
public interface AdviceClient {

  @RequestMapping(method = RequestMethod.GET, value = "/advice")
  String getAdvice();

  @RequestMapping("/advice/{slip_id}")
  String getAdviceById(@PathVariable("slip_id") Integer slipId);
}