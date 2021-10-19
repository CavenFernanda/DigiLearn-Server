package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Subject;
import za.ac.cput.factory.LecturerFactory;
import za.ac.cput.factory.SubjectFactory;
import za.ac.cput.service.impl.LecturerService;
import java.util.Set;

@RestController
@RequestMapping("/lecturer")
public class LecturerController {

    @Autowired
    private LecturerService Lecturerservice;

    @PostMapping("/create")
    public Lecturer create(@RequestBody Lecturer lecturer){ return Lecturerservice.create(lecturer);}

    @GetMapping("/read")
    public Lecturer read(@PathVariable String id){return Lecturerservice.read(id);}

    @PostMapping("/update")
    public Lecturer update(@RequestBody Lecturer lecturer){return Lecturerservice.update(lecturer);}

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){return Lecturerservice.delete(id);}

    @GetMapping("/getall")
    public Set<Lecturer> getAll(){return Lecturerservice.getAll();}

}
