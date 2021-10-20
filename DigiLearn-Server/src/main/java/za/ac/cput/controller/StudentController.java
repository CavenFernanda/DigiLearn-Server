package za.ac.cput.controller;
/*
 *Author: Athi Fukama 218328591
 * Controller class for Student
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Student;
import za.ac.cput.service.StudentService;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student create(@RequestBody Student student){ return studentService.create(student);}

    @GetMapping("/read")
    public Student read(@PathVariable String id){return studentService.read(id);}

    @PostMapping("/update")
    public  Student update(@RequestBody Student student){return studentService.update(student);}

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){return studentService.delete(id);}

    @GetMapping("/getall")
    public List<Student> getAll()
    {
        return studentService.findAll();
    }
}

