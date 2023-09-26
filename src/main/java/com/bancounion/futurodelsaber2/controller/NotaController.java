package com.bancounion.futurodelsaber2.controller;

import com.bancounion.futurodelsaber2.entities.Nota;
import com.bancounion.futurodelsaber2.service.INotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class NotaController {

    @Autowired
    private INotaService notaService;
    @GetMapping("/notas")
    public List<Nota> findALl(){

        List<Nota> notas =notaService.findAll();
        return notas;
    }

    @GetMapping("nota/{id}")
    public Optional<Nota> findByid(@PathVariable("id") long id){
        Optional<Nota> nota =notaService.findByid(id);
        return nota;
    }
}
