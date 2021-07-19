package com.dio.ControleEPontoDeAcesso.aplicacao.repository;


import com.dio.ControleEPontoDeAcesso.aplicacao.model.JornadaTrabalho;
import com.dio.ControleEPontoDeAcesso.aplicacao.model.Ocorrencia;
import com.dio.ControleEPontoDeAcesso.aplicacao.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {

}
