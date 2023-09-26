package com.bancounion.futurodelsaber2.controller;

import com.bancounion.futurodelsaber2.entities.Estudiante;
import com.bancounion.futurodelsaber2.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EstudianteController {

    @Autowired
    private IEstudianteService iEstudianteService;

    @GetMapping("/estudiantes")
    public List<Estudiante> findAll(){
        List<Estudiante> estudianteList=iEstudianteService.findAll();


        System.out.println(estudianteList);
        if(estudianteList!=null){
            return estudianteList;
        }else {
            return estudianteList;
        }
    }


    @GetMapping("/estudiante/{id}")
    public Optional<Estudiante> findById(@PathVariable("id") long id){
        Optional<Estudiante> estudiante =iEstudianteService.findByID(id);
        if (estudiante!=null){
            return  estudiante;

        }else {
            return estudiante;
        }
    }


}
