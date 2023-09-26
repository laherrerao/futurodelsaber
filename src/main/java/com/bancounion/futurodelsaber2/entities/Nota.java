package com.bancounion.futurodelsaber2.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "notas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nota")
    private long id;

    @Column(name = "nota")
    private float calificacion;

    @ManyToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "EST_id")
    private Estudiante estudiante;

    @ManyToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "id_asignatura")
    private Asignatura asignatura;

}
