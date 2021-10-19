package za.ac.cput.service.impl;

//Author : Mathew Fortuin - 219069514
//Service class for Subject
//11/10/21


import za.ac.cput.entity.Subject;

import za.ac.cput.repository.SubjectRepository;

import za.ac.cput.service.SubjectService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


@Service
public class SubjectImp implements SubjectService {

    private static SubjectService service = null;
    @Autowired
    private SubjectRepository repository;

    @Override
    public Set<Subject> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Subject create(Subject Subject) {
        return this.repository.save(Subject);
    }

    @Override
    public Subject read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public Subject update(Subject Subject) {
        if (this.repository.existsById(Subject.toString())){
            return this.repository.save(Subject);
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if (this.repository.existsById(s)) return false;
        else return true;

    }
    
}
