package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Student;
import za.ac.cput.entity.Subject;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryControlledTest {
    @Test
    void createStudent() {
        Student student = StudentFactory.createStudent("Athi","Fukama", "athif@gmail.com" );
        System.out.println(student);
    }
}