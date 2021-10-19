package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestMethodOrder;

import za.ac.cput.entity.Subject;
import za.ac.cput.factory.SubjectFactory;
import za.ac.cput.service.ISubjectService;
import za.ac.cput.service.SubjectService;





import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class SubjectServiceTest {

    private static SubjectService subjectService = SubjectService.getService();
    private static Subject Subject = SubjectFactory.createSubject("App Theory", "50");

    @Test
    void a_create() {
        Subject created = subjectService.create(Subject);
        assertEquals(created.getSubjectId(), Subject.getSubjectId());
        System.out.println("Created ID: " + created.getSubjectId() + "\nSubject ID: " + Subject.getSubjectId() + "\n");
    }

    @Test
    void b_read() {
        Subject read = subjectService.read(Subject.getSubjectId());
        assertNotNull(read);
        System.out.println("Subject Read: " + read + "\n");
    }

    @Test
    void c_update() {
        Subject updated = new Subject.Builder().copy(Subject).setSubjectName("App Theory").build();
        assertNotNull(subjectService.update(updated));
        System.out.println("Updated (" + updated.getSubjectId() + "): " + updated.getSubjectName() + updated.getSubjectCredits()
                + updated.getLectureId()
                + " = Subject: (" + Subject.getSubjectId() + "): " + Subject.getSubjectName() + Subject.getSubjectCredits()
                + Subject.getLectureId());
    }

    @Test
    void e_delete() {
        boolean deleted = subjectService.delete(Subject.getSubjectId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
        d_getAll();
    }

    @Test
    void d_getAll() {
        System.out.println(subjectService.getAll() + "\n");
    }
}