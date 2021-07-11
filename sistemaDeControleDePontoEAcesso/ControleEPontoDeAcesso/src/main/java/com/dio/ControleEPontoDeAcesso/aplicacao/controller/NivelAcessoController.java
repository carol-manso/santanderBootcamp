package com.dio.ControleEPontoDeAcesso.aplicacao.controller;

import com.dio.ControleEPontoDeAcesso.aplicacao.model.NivelAcesso;
import com.dio.ControleEPontoDeAcesso.aplicacao.model.NivelAcesso;
import com.dio.ControleEPontoDeAcesso.aplicacao.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivel_acesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;


    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){

        return nivelAcessoService.save(nivelAcesso);
    }


    @GetMapping
    public List<NivelAcesso> getNivelAcessoList(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{idNivelAcesso}")
    public NivelAcesso getNivelAcessoById(@PathVariable("idNivelAcesso") Long idNivelAcesso) throws Exception {
        return nivelAcessoService.getById(idNivelAcesso).orElseThrow(() -> new Exception("Nível de acesso não encontrado"));
    }
    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso){

        return nivelAcessoService.update(nivelAcesso);
    }
    @DeleteMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> deleteById(@PathVariable("idNivelAcesso") Long idNivelAcesso) throws Exception {
        nivelAcessoService.delete(idNivelAcesso);
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }
}
