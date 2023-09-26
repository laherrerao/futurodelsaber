package com.bancounion.futurodelsaber2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "docente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOC_id")
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_nip")
    private TipoDeDocumento typeOfDocument;

    @OneToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    @Column(name="DOC_numero_documento")
    private String numberOfDocument;
    @Column(name = "DOC_nombre")
    private String name;
    @Column(name="DOC_apellidos")
    private  String lastName;
    @Column(name="DOC_grado_escolaridad")
    private String schoolGrade;

    @Column(name = "DOC_email")
    private String email;
    @Column(name="DOC_telefono")
    private  String phoneNumber;
    @Column(name="DOC_celular")
    private String cellNumber;

    @OneToMany(mappedBy = "docente")
    private List<Asignatura> asignaturas;

    @Override
    public String toString() {
        return "Docente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
