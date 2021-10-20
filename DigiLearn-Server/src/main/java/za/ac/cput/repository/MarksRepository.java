package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Marks;

import java.util.Set;

public interface MarksRepository extends JpaRepository<Marks,String> {
    public Set<Marks> getAll();
}
