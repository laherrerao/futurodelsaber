package com.bancounion.futurodelsaber2.service;

import com.bancounion.futurodelsaber2.entities.Docente;
import com.bancounion.futurodelsaber2.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface IDocenteService {

    public List<Docente> findAll();

    public Optional<Docente> findByid(long id);
}
