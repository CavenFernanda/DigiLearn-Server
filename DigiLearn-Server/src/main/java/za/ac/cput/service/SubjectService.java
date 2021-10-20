package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Subject;
import za.ac.cput.repository.SubjectRepository;

import java.util.List;
import java.util.Set;
@Service
public class SubjectService implements ISubjectService
{
    private static SubjectService subjectService = null;
    @Autowired
    private SubjectRepository SubjectRepository ;


    @Override
    public Subject create(Subject subject) {
        return this.SubjectRepository.save(subject);
    }

    @Override
    public Subject read(String subjectId) {
        return this.SubjectRepository.getById(subjectId);
    }

    @Override
    public Subject update(Subject subject) {
        if(this.SubjectRepository.existsById(subject.getSubjectId()))
        {
            return this.SubjectRepository.save(subject);
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        this.SubjectRepository.deleteById(id);
        if (this.SubjectRepository.existsById(id)) return false;
        else return true;
    }

    public List<Subject> findAll()
    {
        return SubjectRepository.findAll();
    }

}
