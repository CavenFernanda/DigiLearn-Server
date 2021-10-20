package za.ac.cput.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Exam;

import java.util.Set;

public interface IExamRepository extends JpaRepository<Exam,String> {
        }

