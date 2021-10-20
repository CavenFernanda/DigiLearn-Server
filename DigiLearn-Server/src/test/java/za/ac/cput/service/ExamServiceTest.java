package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.Exam;

import za.ac.cput.factory.ExamFactory;

import static org.junit.jupiter.api.Assertions.*;

class ExamServiceTest {
    @Autowired
    private static Exam exam = ExamFactory.createExam("001", "ADP3 exam question 1");
    private static ExamService examService = ExamService.getService();

    @Test
    void a_create() {
        Exam created = examService.create(exam);
        assertEquals(created.getExamId(), exam.getExamId());
        System.out.println("Created ID: " + created.getExamId() + "\nExam ID: " + exam.getExamId() + "\n");
    }

    @Test
    void b_read() {
        Exam read = examService.read(exam.getExamId());
        // assertNotNull(read);
        System.out.println("Exam Read: " + read + "\n");
    }

    @Test
    void c_update() {
        Exam updated = new Exam.Builder().copy(exam).setLecturerId("001").build();
        // assertNotNull(testService.update(updated));
        System.out.println("Updated (" + updated.getExamId() + "): " + updated.getLecturerId() + " " + updated.getExamInfo()
                + " = Exam: (" + exam.getExamId() + "): " + exam.getLecturerId() + " " + exam.getExamInfo());
    }

    @Test
    void e_delete() {
        boolean deleted = examService.delete(exam.getExamId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
        d_getAll();
    }

    @Test
    void d_getAll() {
        System.out.println(examService.getAll() + "\n");
    }
}

