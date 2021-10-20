package za.ac.cput.service;

import za.ac.cput.entity.Exam;
import za.ac.cput.entity.Student;
import za.ac.cput.repository.ExamRepository;
import za.ac.cput.repository.StudentRepository;

import java.util.Set;

public class ExamService implements IExamService {
    private static ExamService examService = null;
    private ExamRepository examRepository = null;

    private ExamService(){
        this.examRepository = ExamRepository.getRepository();
    }

    public static ExamService getService(){
        if(examService == null)
            examService = new ExamService();
        return examService;
    }

    @Override
    public Exam create(Exam  exam ) {
        return this.examRepository.create(exam);
    }

    @Override
    public Exam  read(String examId) {
        return this.examRepository.read(examId);
    }

    @Override
    public Exam  update(Exam exam) {
        return this.examRepository.update(exam);
    }

    @Override
    public boolean delete(String examId) {
        return this.examRepository.delete(examId);
    }

    @Override
    public Set<Exam> getAll() {
        return this.examRepository.getAll();
    }
}

