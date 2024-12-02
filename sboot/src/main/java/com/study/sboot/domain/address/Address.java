package com.study.sboot.domain.address;

import com.study.sboot.domain.events.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Table
@Entity

public class Address {
    @Id
    @GeneratedValue
    private UUID id;
    private String cidade;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Event evento;
}
