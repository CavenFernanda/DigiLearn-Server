package za.ac.cput.repository;
/*
 *
 *
 */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Student;


public interface IStudentRepository extends JpaRepository<Student,String> {
}
