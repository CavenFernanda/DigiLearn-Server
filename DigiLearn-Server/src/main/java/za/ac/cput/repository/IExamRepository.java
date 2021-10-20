package za.ac.cput.repository;


import za.ac.cput.entity.Exam;

import java.util.Set;

public interface IExamRepository extends IRepository <Exam, String>{
    public Set<Exam> getAll();
}
