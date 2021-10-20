package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Student;
import za.ac.cput.factory.StudentFactory;
import za.ac.cput.repository.StudentRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentRepositoryTest {
    private static StudentRepository studentRepository = StudentRepository.getRepository();
    private static Student student = StudentFactory.createStudent("Athi", "Fukama", "athif@gmail.com", "547S");
    @Test
    void a_create() {
        Student created = studentRepository.create(student);
        assertEquals(created.getStudentId(), student.getStudentId());
        System.out.println("Created ID: " + created.getStudentId() + "\nStudent ID: " + student.getStudentId() + "\n");
    }

    @Test
    void b_read() {
        //a_create();
        Student read = studentRepository.read(student.getStudentId());
        //assertNotNull(read);
        System.out.println("Student Read: " + read + "\n");
    }

    @Test
    void c_update() {
        Student updated = new Student.Builder().copy(student).setFirstName("Athi").build();
        //    assertNotNull(studentRepository.update(updated));
        System.out.println("Updated (" + updated.getStudentId() + "): " + updated.getFirstName() + " " + updated.getLastName()
                + updated.getStudentEmail() + " "+ updated.getFirstName() + updated.getCourseId()
                + " " + " = Student: (" + student.getStudentId() + "): " + student.getFirstName() + " " + student.getLastName()
                + student.getStudentEmail() + " "  + student.getCourseId());
    }

    @Test
    void e_delete() {

        boolean deleted = studentRepository.delete(student.getStudentId());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);
        d_getAll();

    }

    @Test
    void d_getAll(){
        System.out.println(studentRepository.getAll() + "\n");
    }
}
