//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Marks;
import za.ac.cput.repository.LecturerRepository;
import za.ac.cput.repository.MarksRepository;

import java.util.Set;

public class MarksService implements IMarksService{
    private static MarksService MarksService = null;
    @Autowired
    private MarksRepository MarksRepository;

    @Override
    public Marks create(Marks s) {
        return this.MarksRepository.save(s);
    }

    @Override
    public Marks read(String id) {
        return this.MarksRepository.getById(id);
    }

    @Override
    public Marks update(Marks s) {
        if(this.MarksRepository.existsById(s.getId()))
        {
            return this.MarksRepository.save(s);
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        this.MarksRepository.deleteById(id);
        if (this.MarksRepository.existsById(id)) return false;
        else return true;
    }

    @Override
    public Set<Marks> getAll() {
        return this.MarksRepository.getAll();
    }
}
