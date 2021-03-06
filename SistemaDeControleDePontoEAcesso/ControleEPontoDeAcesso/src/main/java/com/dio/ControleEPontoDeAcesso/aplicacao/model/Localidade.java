package com.dio.ControleEPontoDeAcesso.aplicacao.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Audited
@Entity
public class Localidade {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;  //1 nível de acesso está para N localidades e 1 localidade tem 1 nível de acesso (1:N)
    private String descricao;

}
