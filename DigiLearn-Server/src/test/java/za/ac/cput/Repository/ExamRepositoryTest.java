package za.ac.cput.Repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Exam;
import za.ac.cput.factory.ExamFactory;
import za.ac.cput.repository.ExamRepository;

import static org.junit.jupiter.api.Assertions.*;

class ExamRepositoryTest {
    private static Exam exam = ExamFactory.createExam("001", "ADP3 test");
    private ExamRepository repository = ExamRepository.getRepository();

    @BeforeEach
    public void setUp() {
        System.out.println("Exam: " + exam);

    }
    @Test
    public void a_create() {
        Exam inserted = repository.create(exam);
        assertEquals(inserted.getExamId(), exam.getExamId());
        System.out.println("Inserted: " + inserted);
    }

    @Test
    public void c_update() {
        Exam updated = new Exam.Builder().copy(exam).setLecturerId("001").build();
        //assertNotNull(repository.update(updated));
        System.out.println("Updated (" + updated.getExamId() + "): " + updated.getLecturerId() + updated.getExamInfo()
                + " = Exam: (" + exam.getExamId() + "): " + exam.getLecturerId() + " " + exam.getExamInfo());
    }

    @Test
    public void b_read() {
        Exam read = repository.read(exam.getExamId());
        //assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    public void e_delete() {
        boolean deleted = repository.delete(exam.getExamId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
        d_getAll();
    }

    @Test
    public void d_getAll(){
        System.out.println(repository.getAll() + "\n");
    }
}