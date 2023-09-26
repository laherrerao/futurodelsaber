package com.bancounion.futurodelsaber2.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="asignatura")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private long id;

    @Column(name="nombre")
    private String description;


    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinColumn(name="DOC_id")
    private Docente docente;



    @ManyToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinTable(name="estudiante_asignatura",
            joinColumns = @JoinColumn(name = "id_asignatura"),
            inverseJoinColumns = @JoinColumn(name = "EST_id"))
    private Set<Estudiante> estudiantes =new HashSet<>();

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", docente=" + docente +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
