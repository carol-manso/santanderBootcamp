package com.dio.ControleEPontoDeAcesso.aplicacao.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Calendario {
    @Id
    private long id;
    @ManyToOne
    private TipoData tipo;
    private String descricao;
    private LocalDateTime dataEspecial;
}
