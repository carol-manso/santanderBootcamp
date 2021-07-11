package com.dio.ControleEPontoDeAcesso.aplicacao.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Ocorrencia {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String descricao;

}
