//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Marks;

import java.util.Set;
@Repository
public interface MarksRepository extends JpaRepository<Marks,Long> {
}
