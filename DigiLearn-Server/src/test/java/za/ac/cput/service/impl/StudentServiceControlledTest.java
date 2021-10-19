package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.Student;
import za.ac.cput.factory.StudentFactory;


import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceControlledTest {
    @Autowired
    private static StudentService service ;
    private static za.ac.cput.entity.Student Student =
            StudentFactory.createStudent("App Dev","50","athif@gamil.com");

    @Test
    public void a_create() {
        za.ac.cput.entity.Student created = service.create(Student);
        assertEquals(created.getStudentId(), Student.getStudentId());
        System.out.println("Created" + created);
    }

    @Test
    public void b_read() {
        Student read =  service.read(Student.toString());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Student updated = new Student.Builder().copy(Student).build();
        updated =  service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void f_delete() {
        boolean deleted = service.delete(Student.toString());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);

    }

    @Test
    public void d_getAll() {
        Set<Student> Student = service.getAll();
        assertEquals(1, Student.size());
        System.out.println("Here are the Students : " + Student);
    }


}