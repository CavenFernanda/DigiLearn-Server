package za.ac.cput.controller;
//  Author: Caven Fernanda - 218074905
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.University;
import za.ac.cput.service.UniversityService;

import java.util.List;

@RestController
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @PostMapping("/create")
    public University create(@RequestBody University university){ return universityService.create(university);}

    @GetMapping("/read")
    public University read(@PathVariable String id){return universityService.read(id);}

    @PostMapping("/update")
    public University update(@RequestBody University university){return universityService.update(university);}

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){return universityService.delete(id);}

    @GetMapping("/getall")
    public List<University> getAll()
    {
        return universityService.findAll();
    }

}
