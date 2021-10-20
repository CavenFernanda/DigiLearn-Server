package za.ac.cput.repository;

/**Author: Caven Fernanda 218704905
 * Repo interface class for University
 **/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.University;


@Repository
public interface UniversityRepository extends JpaRepository<University, String> {
}
