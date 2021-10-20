//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.factory;

import za.ac.cput.entity.Lecturer;
import za.ac.cput.util.GenericHelper;

public class LecturerFactory {
    public static Lecturer build(String firstName, String lastName, String email, String password)
    {
        String id = GenericHelper.generateAnId();
        if(firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || !email.contains("@") || !email.contains(".")
           || password.isEmpty())
        {
            return null;
        }
        return new Lecturer.Builder().id(id).firstName(firstName).lastName(lastName).lecturerEmail(email)
                .password(password).build();
    }
}
