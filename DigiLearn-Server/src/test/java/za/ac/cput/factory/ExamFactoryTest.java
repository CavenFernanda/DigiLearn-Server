package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Exam;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ExamFactoryTest {
    private Exam exam1;
    private Exam exam2;

    public void createExam() {
        Exam exam1 = ExamFactory.createExam("001", "ADP3 test");
        Exam exam2 = ExamFactory.createExam("002", "ADT3 test");

        System.out.println(exam1);
        System.out.println(exam2);

    }

    @BeforeEach
    void setup() {
        Exam exam1 = ExamFactory.createExam("001", "ADP3 test");
        Exam exam2 = ExamFactory.createExam("002", "ADT3 test");
    }


    @Test
    void testEquality() {
        assertEquals(exam1, exam2);
    }

    @Test
    void testIdentity() {
        assertSame(exam1, exam2);
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
        assertEquals(exam1, exam2);

    }
}