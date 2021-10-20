package za.ac.cput.controller;
/*
 *Author: Athi Fukama 218328591
 * Controller class for Exam
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Exam;
import za.ac.cput.service.ExamService;

import java.util.List;

@RestController
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private ExamService examService;

    @PostMapping("/create")
    public Exam create(@RequestBody Exam exam){ return examService.create(exam);}

    @GetMapping("/read")
    public Exam read(@PathVariable String id){return examService.read(id);}

    @PostMapping("/update")
    public Exam update(@RequestBody Exam exam){return examService.update(exam);}

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){return examService.delete(id);}

    @GetMapping("/getall")
    public List<Exam> getAll()
    {
        return examService.findAll();
    }

}