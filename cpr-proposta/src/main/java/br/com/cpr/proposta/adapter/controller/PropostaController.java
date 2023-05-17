package br.com.cpr.proposta.adapter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/propostas")
public class PropostaController {

    @GetMapping("/init")
    @ResponseStatus(HttpStatus.OK)
    public void init() {
      log.info("init proposal...200...ok");
    }
}
