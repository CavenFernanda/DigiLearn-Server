package za.ac.cput.service;
/**Author: Mathew Fortuin 219069514
 * Service class for Subject
 **/

import za.ac.cput.entity.Subject;

import java.util.Set;
public interface SubjectService extends IService<Subject,String>
{

    Set<Subject> getAll();


}
