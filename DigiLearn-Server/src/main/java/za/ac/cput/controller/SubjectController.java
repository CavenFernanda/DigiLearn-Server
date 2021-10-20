package za.ac.cput.controller;

//Author: Mathew Fortuin - 219069514
//Controller class for Subject
//10/10/21

import za.ac.cput.entity.Subject;

import za.ac.cput.factory.SubjectFactory;

import za.ac.cput.service.SubjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/create")
    public Subject create(@RequestBody Subject subject){

        return subjectService.create(subject);
    }

    @GetMapping("/read/{id}")
    public Subject read(@PathVariable String id){
        return subjectService.read(id);
    }

    @PostMapping ("/update")
    public Subject update(@RequestBody Subject subject){
        return subjectService.update(subject);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return subjectService.delete(id);
    }

    @GetMapping("/getall")
    public List<Subject> getAll()
    {
        return subjectService.findAll();
    }
}
