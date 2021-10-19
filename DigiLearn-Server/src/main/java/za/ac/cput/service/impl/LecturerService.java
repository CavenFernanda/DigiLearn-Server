package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.repository.LecturerRepository;
import za.ac.cput.repository.SubjectRepository;
import za.ac.cput.service.ILecturerService;
import za.ac.cput.service.SubjectService;

import java.util.Set;
import java.util.stream.Collectors;

public class LecturerService implements ILecturerService {

    private static LecturerService LecturerService = null;
    @Autowired
    private LecturerRepository LecturerRepository;

    @Override
    public Lecturer create(Lecturer s) {
        return this.LecturerRepository.save(s);
    }

    @Override
    public Lecturer read(String id) {
        return this.LecturerRepository.findById(id).orElse(null);
    }

    @Override
    public Lecturer update(Lecturer s) {
        if(this.LecturerRepository.existsById(s.getId()))
        {
            return this.LecturerRepository.save(s);
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        this.LecturerRepository.deleteById(id);
        if (this.LecturerRepository.existsById(id)) return false;
        else return true;
    }

    @Override
    public Set<Lecturer> getAll() {
        return this.LecturerRepository.findAll().stream().collect(Collectors.toSet());
    }
}
