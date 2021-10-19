package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Subject;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer,String> {
}
