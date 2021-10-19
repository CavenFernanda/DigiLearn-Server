package za.ac.cput.service;
/**Author: Mathew Fortuin 219069514
 * Service class for Subject
 **/

import org.springframework.stereotype.Service;
import za.ac.cput.entity.Subject;

import java.util.Set;
@Service
public interface ISubjectService extends IService <Subject,String> {

    public Set<Subject> getAll();

}
