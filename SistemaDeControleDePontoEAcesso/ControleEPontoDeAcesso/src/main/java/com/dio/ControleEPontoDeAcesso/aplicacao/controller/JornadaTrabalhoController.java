package com.dio.ControleEPontoDeAcesso.aplicacao.controller;

import com.dio.ControleEPontoDeAcesso.aplicacao.model.JornadaTrabalho;
import com.dio.ControleEPontoDeAcesso.aplicacao.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //sempre retorna como um JSON- API
@RequestMapping("/jornada") //Cliente faz uma requisição para /jornada
public class JornadaTrabalhoController {
    @Autowired
    JornadaService jornadaService;


    @PostMapping //requisição POST para /jornada
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){

        return jornadaService.save(jornadaTrabalho);
    }
    //mando para a requisição um objeto do tipo jornada

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public JornadaTrabalho getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return jornadaService.getById(idJornada).orElseThrow(() -> new Exception("jornada não encontrada"));
    }
    @PutMapping //requisição PUT para /jornada
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){

        return jornadaService.update(jornadaTrabalho);
    }
    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        jornadaService.delete(idJornada);
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
