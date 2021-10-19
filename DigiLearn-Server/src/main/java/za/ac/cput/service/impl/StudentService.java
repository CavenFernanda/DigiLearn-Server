package za.ac.cput.service.impl;

import za.ac.cput.entity.Student;
import za.ac.cput.repository.StudentRepository;
import za.ac.cput.service.IStudentService;

import java.util.Set;
public class StudentService implements IStudentService {

    private static StudentService studentService = null;
    private StudentRepository studentRepository = null;
    private StudentService(){
        this.studentRepository = StudentRepository.getRepository();
    }

    public static StudentService getService(){
        if(studentService == null)
            studentService = new StudentService();
        return studentService;
    }

    @Override
    public Student create(Student student) {
        return this.studentRepository.create(student);
    }

    @Override
    public Student read(String studentId) {
        return this.studentRepository.read(studentId);
    }

    @Override
    public Student update(Student student) {
        return this.studentRepository.update(student);
    }

    @Override
    public boolean delete(String studentId) {
        return this.studentRepository.delete(studentId);
    }

    @Override
    public Set<Student> getAll() {
        return this.studentRepository.getAll();
    }
}

