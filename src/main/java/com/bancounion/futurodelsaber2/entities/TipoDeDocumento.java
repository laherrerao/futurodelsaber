package com.bancounion.futurodelsaber2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "tipos_de_documento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoDeDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nip")
    private long id;

    @Column(name="tipo")
    private String type;



}
