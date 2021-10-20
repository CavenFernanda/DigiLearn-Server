package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.Faculty;

import static org.junit.jupiter.api.Assertions.*;

class FacultyFactoryTest {

    Faculty faculty = FacultyFactory.buildFaculty("Informatics and Design","0219596767");
    Faculty faculty1 = FacultyFactory.buildFaculty("Informatics and Design","0219596767");

    @Test
    public void ObjectEquality(){
        assertNotEquals(faculty,faculty1);
    }

    @Test
    public void ObjectIdentity(){

        assertNotEquals(faculty,faculty1);
    }

    @Test
    @Timeout(2)
    public void TimeoutTest()
    {
        ObjectIdentity();
    }

    @Disabled
    @Test
    public void ObjectEquals()
    {
        assertNotEquals(faculty,faculty1);
    }
}