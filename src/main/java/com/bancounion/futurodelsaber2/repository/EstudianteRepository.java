package com.bancounion.futurodelsaber2.repository;

import com.bancounion.futurodelsaber2.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
}
