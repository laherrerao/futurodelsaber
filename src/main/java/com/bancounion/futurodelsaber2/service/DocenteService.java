package com.bancounion.futurodelsaber2.service;

import com.bancounion.futurodelsaber2.entities.Docente;
import com.bancounion.futurodelsaber2.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService  implements  IDocenteService{
    @Autowired
    private DocenteRepository docenteRepository;
    @Override
    public List<Docente> findAll() {
        return (List<Docente>) docenteRepository.findAll();
    }

    @Override
    public Optional<Docente> findByid(long id) {

        return docenteRepository.findById(id);
    }
}
