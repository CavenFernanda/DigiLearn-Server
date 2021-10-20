package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.Student;
import za.ac.cput.repository.StudentRepository;

import java.util.List;
@Service
public class StudentService implements IStudentService {

    private static StudentService studentService = null;
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student create(Student s) {
        return this.studentRepository.save(s);
    }

    @Override
    public Student read(String id) { return this.studentRepository.getById(id);}

    @Override
    public Student update(Student s) {
        if(this.studentRepository.existsById(s.getId()))
        {
            return this.studentRepository.save(s);
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        this.studentRepository.deleteById(id);
        if (this.studentRepository.existsById(id)) return false;
        else return true;
    }

    public List<Student> findAll()
    {
        return this.studentRepository.findAll();
    }
}
