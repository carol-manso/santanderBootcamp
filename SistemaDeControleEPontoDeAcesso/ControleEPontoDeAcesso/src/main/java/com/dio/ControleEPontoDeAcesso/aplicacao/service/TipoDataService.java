package com.dio.ControleEPontoDeAcesso.aplicacao.service;

import com.dio.ControleEPontoDeAcesso.aplicacao.model.TipoData;
import com.dio.ControleEPontoDeAcesso.aplicacao.model.TipoData;
import com.dio.ControleEPontoDeAcesso.aplicacao.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {
    TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository) {
        this.tipoDataRepository = tipoDataRepository;
    }
    public TipoData save(TipoData tipoData){
        return tipoDataRepository.save(tipoData);

    }

    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> getById(Long idTipoData) {
        return tipoDataRepository.findById(idTipoData);
    }
    public TipoData update(TipoData tipoData){
        return tipoDataRepository.save(tipoData);

    }
    public void delete(Long idTipoData) {
        tipoDataRepository.deleteById(idTipoData);
    }
}
