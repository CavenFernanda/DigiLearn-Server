package za.ac.cput.repository;

/**Author: Mathew Fortuin 219069514
 * Repo class for Subject
 **/

import za.ac.cput.entity.Subject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

public class SubjectRepository implements ISubjectRepository{

    private static SubjectRepository repository = null;
    private Set<Subject> subjectdb= null;

    private SubjectRepository() {
        subjectdb = new HashSet<Subject>();
    }

    public static SubjectRepository getRepository(){
        if(repository == null)
            repository = new SubjectRepository();
        return repository;
    }

    @Override
    public Subject create(Subject Subject) {
        boolean success = this.subjectdb.add(Subject);
        if(!success)
            return null;

        return Subject;
    }

    @Override
    public Subject read(String SubjectId) {

        for (Subject Subject : this.subjectdb) {
            String subjectId;
            if (Subject.getSubjectId().equalsIgnoreCase(SubjectId));
                return Subject;
        }

        return null;
    }

    @Override
    public Subject update(Subject Subject) {
        Subject preUpdate = read(Subject.getSubjectId());

        if (preUpdate != null) {
            this.subjectdb.remove(preUpdate);
            this.subjectdb.add(Subject);
            return Subject;
        }

        return null;
    }

    @Override
    public boolean delete(String SubjectId) {
        Subject SubjectToDelete = read(SubjectId);

        if (SubjectToDelete != null) {
            this.subjectdb.remove(SubjectToDelete);
            return true;
        }
        return false;
    }

    @Override
    public Set<Subject> getAll() {
        return subjectdb;
    }
}
