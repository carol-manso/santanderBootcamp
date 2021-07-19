package com.dio.ControleEPontoDeAcesso.aplicacao.controller;

import com.dio.ControleEPontoDeAcesso.aplicacao.model.Localidade;
import com.dio.ControleEPontoDeAcesso.aplicacao.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {
    @Autowired
    LocalidadeService localidadeService;


    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade){

        return localidadeService.save(localidade);
    }
    //mando para a requisição um objeto do tipo jornada

    @GetMapping
    public List<Localidade> getLocalidadeList(){
        return localidadeService.findAll();
    }

    @GetMapping("/{idLocalidade}")
    public Localidade getLocalidadeById(@PathVariable("idLocalidade") Long idLocalidade) throws Exception {
        return localidadeService.getById(idLocalidade).orElseThrow(() -> new Exception("localidade não encontrada"));
    }
    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidade){

        return localidadeService.update(localidade);
    }
    @DeleteMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> deleteById(@PathVariable("idLocalidade") Long idLocalidade) throws Exception {
        localidadeService.delete(idLocalidade);
        return (ResponseEntity<Localidade>) ResponseEntity.ok();
    }
}
