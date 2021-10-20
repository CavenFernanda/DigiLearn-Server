//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Subject;

import java.util.Set;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer,String> {
    public Set<Lecturer> getAll();
}
