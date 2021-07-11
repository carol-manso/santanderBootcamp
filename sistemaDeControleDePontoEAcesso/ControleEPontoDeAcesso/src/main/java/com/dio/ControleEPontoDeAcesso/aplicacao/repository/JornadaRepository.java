package com.dio.ControleEPontoDeAcesso.aplicacao.repository;

import com.dio.ControleEPontoDeAcesso.aplicacao.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {

}
