package com.bancounion.futurodelsaber2.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "estudiante")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante implements Serializable {

    private static  final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EST_id")
    private long id;




    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_nip")
    private TipoDeDocumento typeOfDocument;


    @ManyToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinTable(name="estudiante_asignatura" ,
            joinColumns = @JoinColumn(name = "EST_id"),
            inverseJoinColumns = @JoinColumn(name="id_asignatura")
    )
    private Set<Asignatura> asignatura= new HashSet<>();

    @Column(name = "EST_numero_documento")
    private String numberOfDocument;

    @Column(name = "EST_nombre")
    private String name;

    @Column(name = "EST_apellido")
    private String lastName;

    @Column(name="EST_fecha_nacimiento")
    private Date dateOfBorn;



    @ManyToOne
    @JoinColumn(name = "id_curso")
    private  Curso curso;

    @Column(name = "EST_ciudad")
    private String city;

    @Column(name = "EST_direccion")
    private String address;

    @Column(name="EST_email")
    private String email;

    @Column(name = "EST_telefono")
    private String phoneNumber;

    @Column(name="EST_celular")
    private String  cellNumber;

    @Column(name="EST_nombre_completo")
    private  String fullName;


}
