package com.bancounion.futurodelsaber2.service;

import com.bancounion.futurodelsaber2.entities.Estudiante;
import com.bancounion.futurodelsaber2.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements IEstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> findAll() {

        return (List<Estudiante>) estudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> findByID(long id) {
        return estudianteRepository.findById(id);
    }
}
