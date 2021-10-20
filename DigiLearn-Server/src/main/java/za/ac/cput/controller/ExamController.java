package za.ac.cput.controller;
/*
 *Author: Athi Fukama 218328591
 * Controller class for Exam
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Exam;
import za.ac.cput.factory.ExamFactory;
import za.ac.cput.service.ExamService;


@RestController
public class ExamController { @Autowired
private ExamService examService;

    @PostMapping("/create")
    public Exam create(@RequestBody Exam exam){ Exam newExam
            = ExamFactory
            .createExam("001","Application Dev Question 1");

        return examService.create(newExam);
    }

    @GetMapping("/read/{id}")
    public Exam read(@PathVariable String id){
        return examService.read(id);
    }

    @PostMapping ("/update")
    public Exam update(@RequestBody Exam exam){
        return examService.update(exam);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return examService.delete(id);
    }
}