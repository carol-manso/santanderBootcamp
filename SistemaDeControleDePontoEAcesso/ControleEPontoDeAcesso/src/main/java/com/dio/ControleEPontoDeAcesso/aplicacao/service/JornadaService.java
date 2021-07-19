package com.dio.ControleEPontoDeAcesso.aplicacao.service;

import com.dio.ControleEPontoDeAcesso.aplicacao.model.JornadaTrabalho;
import com.dio.ControleEPontoDeAcesso.aplicacao.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {
    JornadaRepository jornadaRepository;

    @Autowired //inicia uma instância automaticamente, sem new
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }
    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
        //método save já retorna o objeto.
    } //save cria e atualiza.


    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }
    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
        //método save já retorna o objeto.
    }
    public void delete(Long idJornada) {
         jornadaRepository.deleteById(idJornada);
    }
}
