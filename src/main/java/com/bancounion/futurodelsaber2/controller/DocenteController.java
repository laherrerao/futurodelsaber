package com.bancounion.futurodelsaber2.controller;

import com.bancounion.futurodelsaber2.entities.Docente;
import com.bancounion.futurodelsaber2.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DocenteController {

    @Autowired
    private IDocenteService docenteService;
    @GetMapping("/docentes")
    public List<Docente> findAll(){
        List<Docente> docentes=docenteService.findAll();
        return  docentes;
    }

    @GetMapping("/docente/{id}")
    public Optional<Docente> findByid(@PathVariable("id")long id){
        Optional<Docente> docente =docenteService.findByid(id);
        return docente;
    }
}
