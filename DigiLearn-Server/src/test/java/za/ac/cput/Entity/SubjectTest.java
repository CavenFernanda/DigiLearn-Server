package za.ac.cput.Entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    private SubjectTest subject1;
    private SubjectTest subject2;
    private SubjectTest subject3;

    @BeforeEach
    void setUp() {

        subject1 = new SubjectTest();
        subject2 = new SubjectTest();
        subject3 = subject1;



    }
    //Object Equality
    @Test

    public void testObjectEquality() //shallow Comparison (==)
    {
        assertSame(subject1, subject3);

    }

    @Test

    public void testObjectEquality2()
    {
        assertSame(subject1, subject2);

    }

    //Object Identity
    @Test

    public void testObjectIdentity() //Deep comparison(.equals)
    {
        assertEquals(subject1,subject3);
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
        assertEquals(subject1, subject2);

    }

}