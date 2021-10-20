package za.ac.cput.factory;


/** Author: Mathew Fortuin
 * Factory Test
 **/
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Subject;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubjectFactoryTest {

    private String subject1;
    private String subject2;

    public void createSubject() {
        Subject subject1 = SubjectFactory.createSubject("Architecture Practices","36");
        Subject subject2 = SubjectFactory.createSubject("Business Management","26");

        System.out.println(subject1);
        System.out.println(subject2);

    }

    @BeforeEach
    void setUp() {
        Subject subject1 = SubjectFactory.createSubject("Architecture Practices","36");
        Subject subject2 = SubjectFactory.createSubject("Business Management","26");
    }

    @Test
    void testEquality() {
        assertEquals(subject1, subject2);

    }

    @Test
    void testIdentity() {

        assertSame(subject1, subject2);

    }

////    @Test
////    void testTimeouts() {
////        assertTimeout(Duration.ofMillis(20), () -> {
////            Thread.sleep(1000);
////        });
//    }

    @Disabled
    @Test
    void disableTest() {
        assertEquals(subject1, subject2);

    }


    }
