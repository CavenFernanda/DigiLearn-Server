package za.ac.cput.repository;

/**Author: Caven Fernanda 218704905
 * Repo interface class for Faculty
 **/
import za.ac.cput.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository <Faculty, String>{
}
