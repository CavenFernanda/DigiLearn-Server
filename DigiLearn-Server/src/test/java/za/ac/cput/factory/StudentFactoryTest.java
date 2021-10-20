package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Student;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {
    private String student1;
    private String student2;

    public void createStudent() {
        Student student1 = StudentFactory.createStudent("Athi", "Fukama", "athif@gmail.com", "547S");
        Student student2 = StudentFactory.createStudent("Siwe", "Nini", "siwewethu@gmail.com", "547S");

        System.out.println(student1);
        System.out.println(student2);

    }


    @BeforeEach
    void setUp() {
        Student student1 = StudentFactory.createStudent("Athi", "Fukama", "athif@gmail.com", "547S");
        Student student2 = StudentFactory.createStudent("Siwe", "Nini", "siwewethu@gmail.com", "547S");
    }

    @Test
    void testEquality() {
        assertEquals(student1, student2);

    }

    @Test
    void testIdentity() {

        assertSame(student1, student2);

    }

    @Test
    void testTimeouts() {
        assertTimeout(Duration.ofMillis(20), () -> {
            Thread.sleep(1000);
        });
    }

    @Disabled
    @Test
    void disableTest() {
        assertEquals(student1, student2);

    }
}

