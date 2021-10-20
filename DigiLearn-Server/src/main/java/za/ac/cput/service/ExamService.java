package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Exam;
import za.ac.cput.repository.ExamRepository;

import java.util.List;

@Service
public class ExamService implements IExamService {

    private static ExamService examService = null;
    @Autowired
    private ExamRepository examRepository;


    @Override
    public Exam create(Exam s) {
        return this.examRepository.save(s);
    }

    @Override
    public Exam read(String id) { return this.examRepository.getById(id);}

    @Override
    public Exam update(Exam s) {
        if(this.examRepository.existsById(s.getId()))
        {
            return this.examRepository.save(s);
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        this.examRepository.deleteById(id);
        if (this.examRepository.existsById(id)) return false;
        else return true;
    }

    public List<Exam> findAll()
    {
        return this.examRepository.findAll();
    }
}