package com.bancounion.futurodelsaber2.service;

import com.bancounion.futurodelsaber2.entities.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IEstudianteService {
    public List<Estudiante> findAll();

    public Optional<Estudiante> findByID(long id);
}
