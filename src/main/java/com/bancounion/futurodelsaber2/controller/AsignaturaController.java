package com.bancounion.futurodelsaber2.controller;

import com.bancounion.futurodelsaber2.entities.Asignatura;
import com.bancounion.futurodelsaber2.service.IAsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AsignaturaController {
    @Autowired
    private IAsignaturaService asignaturaService;
    @GetMapping("/asignaturas")
    public List<Asignatura> findAll(){
        List<Asignatura> asignaturas =asignaturaService.findAll();
        return asignaturas;
    }

    @GetMapping("/asignatura/{id}")
    public Optional<Asignatura> findById(@PathVariable("id")long id){
        Optional<Asignatura> asignatura= asignaturaService.findById(id);
        return asignatura;
    }

    }
