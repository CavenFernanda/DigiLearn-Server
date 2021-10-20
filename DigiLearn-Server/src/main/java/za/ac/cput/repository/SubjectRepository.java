package za.ac.cput.repository;

/**Author: Mathew Fortuin 219069514
 * Repo interface class for Subject
 **/

import za.ac.cput.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface SubjectRepository extends JpaRepository <Subject,String> {

    

}
