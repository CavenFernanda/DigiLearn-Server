package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.University;
import za.ac.cput.repository.UniversityRepository;

import java.util.List;

@Service
public class UniversityService implements IUniversityService{

    private static UniversityService universityService = null;

    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public University create(University university) {
        return this.universityRepository.save(university);
    }

    @Override
    public University read(String id) {
        return this.universityRepository.getById(id);
    }

    @Override
    public University update(University university) {

        if(this.universityRepository.existsById(university.getId())){
            return this.universityRepository.save(university);
        }

        return null;
    }

    @Override
    public boolean delete(String id) {

        if(this.universityRepository.existsById(id)) return false;
        else return true;
    }

    public List<University> findAll(){return this.universityRepository.findAll();}
}
