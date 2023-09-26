package com.bancounion.futurodelsaber2.service;

import com.bancounion.futurodelsaber2.entities.Asignatura;
import com.bancounion.futurodelsaber2.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService implements  IAsignaturaService {
    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Override
    public List<Asignatura> findAll() {
        return (List<Asignatura>) asignaturaRepository.findAll();
    }

    @Override
    public Optional<Asignatura> findById(long id) {
        return asignaturaRepository.findById(id);
    }
}
