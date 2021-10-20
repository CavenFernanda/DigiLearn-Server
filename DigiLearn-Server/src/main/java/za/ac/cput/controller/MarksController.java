//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Marks;
import za.ac.cput.service.MarksService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/marks")
public class MarksController {
    @Autowired
    private MarksService marksService;

    @PostMapping("/create")
    public Marks create(@RequestBody Marks marks){ return marksService.create(marks);}

    @GetMapping("/read")
    public Marks read(@PathVariable String id){return marksService.read(id);}

    @PostMapping("/update")
    public Marks update(@RequestBody Marks marks){return marksService.update(marks);}

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){return marksService.delete(id);}

    @GetMapping("/getall")
    public List<Marks> getAll()
    {
        return marksService.findAll();
    }
}
