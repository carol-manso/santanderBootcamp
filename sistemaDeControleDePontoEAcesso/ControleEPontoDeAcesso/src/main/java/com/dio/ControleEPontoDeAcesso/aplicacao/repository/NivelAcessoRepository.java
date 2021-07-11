package com.dio.ControleEPontoDeAcesso.aplicacao.repository;


import com.dio.ControleEPontoDeAcesso.aplicacao.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {

}
