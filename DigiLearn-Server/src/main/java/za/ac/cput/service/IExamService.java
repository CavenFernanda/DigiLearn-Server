package za.ac.cput.service;

import za.ac.cput.entity.Exam;


import java.util.Set;

public interface IExamService  extends IService <Exam, String> {
    public Set<Exam> getAll();
}
