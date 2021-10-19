package za.ac.cput.repository;

/**Author: Mathew Fortuin 219069514
 * Repo class for Subject
 **/

import za.ac.cput.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository <Subject,String> {


}
