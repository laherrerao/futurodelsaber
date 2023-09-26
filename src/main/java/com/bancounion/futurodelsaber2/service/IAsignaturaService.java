package com.bancounion.futurodelsaber2.service;

import com.bancounion.futurodelsaber2.entities.Asignatura;

import java.util.List;
import java.util.Optional;

public interface IAsignaturaService {

    public List<Asignatura> findAll();

    public Optional<Asignatura> findById(long id);
}
