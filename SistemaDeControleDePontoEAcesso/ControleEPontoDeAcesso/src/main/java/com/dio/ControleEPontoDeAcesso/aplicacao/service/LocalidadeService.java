package com.dio.ControleEPontoDeAcesso.aplicacao.service;

import com.dio.ControleEPontoDeAcesso.aplicacao.model.Localidade;
import com.dio.ControleEPontoDeAcesso.aplicacao.model.Localidade;
import com.dio.ControleEPontoDeAcesso.aplicacao.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {
    LocalidadeRepository localidadeRepository;

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }
    public Localidade save(Localidade localidade){
        return localidadeRepository.save(localidade);

    }

    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> getById(Long idLocalidade) {
        return localidadeRepository.findById(idLocalidade);
    }
    public Localidade update(Localidade localidade){
        return localidadeRepository.save(localidade);

    }
    public void delete(Long idLocalidade) {
        localidadeRepository.deleteById(idLocalidade);
    }
}
