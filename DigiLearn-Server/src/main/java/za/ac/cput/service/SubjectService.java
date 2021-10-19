package za.ac.cput.service;

import za.ac.cput.entity.Subject;
import za.ac.cput.repository.SubjectRepository;
import za.ac.cput.service.ISubjectService;

import java.util.Set;

public class SubjectService implements ISubjectService
{
    private static SubjectService subjectService = null;
    private SubjectRepository subjectRepository = null;

    private SubjectService() {
        this.subjectRepository = SubjectRepository.getRepository();

    }
    public static SubjectService getService(){
        if(subjectService == null)
            subjectService = new SubjectService();
        return subjectService;
    }

    @Override
    public Subject create(Subject subject) {
        return this.subjectRepository.create(subject);
    }

    @Override
    public Subject read(String subjectId) {
        return this.subjectRepository.read(subjectId);
    }

    @Override
    public Subject update(Subject subject) {
        return this.subjectRepository.update(subject);
    }

    @Override
    public boolean delete(String subjectId) {
        return this.subjectRepository.delete(subjectId);
    }

    @Override
    public Set<Subject> getAll() {
        return this.subjectRepository.getAll();
    }

}
