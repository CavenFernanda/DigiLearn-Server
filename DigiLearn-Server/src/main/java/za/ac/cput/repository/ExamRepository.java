package za.ac.cput.repository;


import za.ac.cput.entity.Exam;

import java.util.HashSet;
import java.util.Set;

public class ExamRepository implements IExamRepository{
    private static ExamRepository repository = null;
    private Set<Exam> examDB= null;

    private ExamRepository() {
        examDB = new HashSet<Exam>();
    }

    public static ExamRepository getRepository(){
        if(repository == null)
            repository = new ExamRepository();
        return repository;
    }

    @Override
    public Exam create(Exam exam) {
        boolean success = this.examDB.add(exam);
        if(!success)
            return null;

        return exam;
    }

    @Override
    public Exam read(String ExamId) {

        for (Exam exam : this.examDB) {
            String examId;
            if (exam.getExamId().equalsIgnoreCase(ExamId))
                return exam;
        }

        return null;
    }

    @Override
    public Exam update(Exam exam) {
       Exam preUpdate = read(exam.getExamId());

        if (preUpdate != null) {
            this.examDB.remove(preUpdate);
            this.examDB.add(exam);
            return exam;
        }

        return null;
    }

    @Override
    public boolean delete(String examId) {
        Exam examToDelete = read(examId);

        if (examToDelete != null) {
            this.examDB.remove(examToDelete);
            return true;
        }
        return false;
    }

    @Override
    public Set<Exam> getAll() {
        return examDB;
    }
}

