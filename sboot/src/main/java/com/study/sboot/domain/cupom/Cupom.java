package com.study.sboot.domain.cupom;

import com.study.sboot.domain.events.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "cupom")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cupom {
    @Id
    @GeneratedValue
    private UUID id;
    private String codigo;
    private Integer desconto;
    private Date validade;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Event evento;
}
