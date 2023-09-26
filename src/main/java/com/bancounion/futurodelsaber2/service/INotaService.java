package com.bancounion.futurodelsaber2.service;

import com.bancounion.futurodelsaber2.entities.Nota;

import java.util.List;
import java.util.Optional;

public interface INotaService {

    public List<Nota> findAll();

    public Optional<Nota> findByid(long id);
}
