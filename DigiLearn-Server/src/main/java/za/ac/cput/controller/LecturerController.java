//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.service.LecturerService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/lecturer")
public class LecturerController {

    @Autowired
    private LecturerService Lecturerservice;

    @CrossOrigin
    @PostMapping("/create")
    public Lecturer create(@RequestBody Lecturer lecturer){ return Lecturerservice.create(lecturer);}

    @GetMapping("/read")
    public Lecturer read(@PathVariable Long id){return Lecturerservice.read(id);}

    @PostMapping("/update")
    public Lecturer update(@RequestBody Lecturer lecturer){return Lecturerservice.update(lecturer);}

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id){return Lecturerservice.delete(id);}

    @GetMapping("/getall")
    public List<Lecturer> getAll()
    {
        return Lecturerservice.findAll();
    }

}
