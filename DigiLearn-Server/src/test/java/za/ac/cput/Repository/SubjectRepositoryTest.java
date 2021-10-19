package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Subject;
import za.ac.cput.factory.SubjectFactory;
import za.ac.cput.repository.SubjectRepository;

import static org.junit.jupiter.api.Assertions.*;

class SubjectRepositoryTest {


    private static SubjectRepository subjectRepository = SubjectRepository.getRepository();
    private static Subject subject = SubjectFactory.createSubject("Business Management","50");
    @Test
    void a_create() {
        Subject created = subjectRepository.create(subject);
        assertEquals(created.getSubjectId(), subject.getSubjectId());
        System.out.println("Created ID: " + created.getSubjectId() + "\nSubject ID: " + subject.getSubjectId() + "\n");
    }

    @Test
    void b_read() {
        //a_create();
        Subject read = subjectRepository.read(subject.getSubjectId());
        //assertNotNull(read);
        System.out.println("Subject Read: " + read + "\n");
    }

    @Test
    void c_update() {
        Subject updated = new Subject.Builder().copy(subject).setSubjectName("ICT Electives").build();

        System.out.println("Updated (" + updated.getSubjectId() + "): " + updated.getSubjectName() + " " + updated.getSubjectCredits()
                + updated.getLectureId()
                + " " + " = Subject: (" + subject.getSubjectId() + "): " + subject.getSubjectName() + " " + subject.getSubjectCredits()
                + subject.getLectureId());
    }

    @Test
    void e_delete() {

        boolean deleted = subjectRepository.delete(subject.getSubjectId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
        d_getAll();

    }

    @Test
    void d_getAll(){
        System.out.println(subjectRepository.getAll() + "\n");
    }

}