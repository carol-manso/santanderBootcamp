package com.dio.ControleEPontoDeAcesso.aplicacao.controller;

import com.dio.ControleEPontoDeAcesso.aplicacao.model.Ocorrencia;
import com.dio.ControleEPontoDeAcesso.aplicacao.model.Ocorrencia;
import com.dio.ControleEPontoDeAcesso.aplicacao.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {
    @Autowired
    OcorrenciaService OcorrenciaService;


    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){

        return OcorrenciaService.save(ocorrencia);
    }
    //mando para a requisição um objeto do tipo jornada

    @GetMapping
    public List<Ocorrencia> getOcorrenciaList(){
        return OcorrenciaService.findAll();
    }

    @GetMapping("/{idOcorrencia}")
    public Ocorrencia getOcorrenciaById(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception {
        return OcorrenciaService.getById(idOcorrencia).orElseThrow(() -> new Exception("tipo de data não encontrada"));
    }
    @PutMapping //requisição PUT para /tipo_data
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){

        return OcorrenciaService.update(ocorrencia);
    }
    @DeleteMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> deleteById(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception {
        OcorrenciaService.delete(idOcorrencia);
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();
    }
}
