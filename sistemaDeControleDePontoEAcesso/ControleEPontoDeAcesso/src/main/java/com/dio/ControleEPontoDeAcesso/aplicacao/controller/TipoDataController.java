package com.dio.ControleEPontoDeAcesso.aplicacao.controller;

import com.dio.ControleEPontoDeAcesso.aplicacao.model.TipoData;
import com.dio.ControleEPontoDeAcesso.aplicacao.model.TipoData;
import com.dio.ControleEPontoDeAcesso.aplicacao.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo_data")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;


    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData){

        return tipoDataService.save(tipoData);
    }


    @GetMapping
    public List<TipoData> getTipoDataList(){
        return tipoDataService.findAll();
    }

    @GetMapping("/{idTipoData}")
    public TipoData getTipoDataById(@PathVariable("idTipoData") Long idTipoData) throws Exception {
        return tipoDataService.getById(idTipoData).orElseThrow(() -> new Exception("tipo de data não encontrada"));
    }
    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){

        return tipoDataService.update(tipoData);
    }
    @DeleteMapping("/{idTipoData}")
    public ResponseEntity<TipoData> deleteById(@PathVariable("idTipoData") Long idTipoData) throws Exception {
        tipoDataService.delete(idTipoData);
        return (ResponseEntity<TipoData>) ResponseEntity.ok();
    }
}
