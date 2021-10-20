package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Faculty;
import za.ac.cput.repository.FacultyRepository;

import java.util.List;

@Service
public class FacultyService implements IFacultyService{

    private static FacultyService facultyService = null;

    @Autowired
    private FacultyRepository FacultyRepository;

    @Override
    public Faculty create(Faculty faculty) {
        return this.FacultyRepository.save(faculty);
    }

    @Override
    public Faculty read(String id) {
        return this.FacultyRepository.getById(id);
    }

    @Override
    public Faculty update(Faculty faculty) {

        if(this.FacultyRepository.existsById(faculty.getId())){
            return this.FacultyRepository.save(faculty);
        }

        return null;
    }

    @Override
    public boolean delete(String id ) {
        this.FacultyRepository.deleteById(id);

        if(this.FacultyRepository.existsById(id)) return false;
        else return true;
    }

    public List<Faculty> findAll(){return this.FacultyRepository.findAll();}
}
