package za.ac.cput.factory;


/** Author: Mathew Fortuin
 * Factory Test
 **/
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Subject;

class SubjectFactoryControlledTest {

    @Test
    void createSubject() {
        Subject subject = SubjectFactory.createSubject("App Dev","36" );
        System.out.println(subject);
    }

}