package com.bancounion.futurodelsaber2.service;

import com.bancounion.futurodelsaber2.entities.Nota;
import com.bancounion.futurodelsaber2.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaService implements INotaService{

   @Autowired
   private NotaRepository notaRepository;
    @Override
    public List<Nota> findAll() {
        return (List<Nota>) notaRepository.findAll();
    }

    @Override
    public Optional<Nota> findByid(long id) {
        return notaRepository.findById(id);
    }
}
