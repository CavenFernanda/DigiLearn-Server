package za.ac.cput.factory;

import za.ac.cput.entity.Faculty;
import za.ac.cput.util.GenericHelper;

/**Author: Caven Fernanda 218074905
 * Factory class for Faculty
 **/
public class FacultyFactory {

    public static Faculty buildFaculty(String name, String phone){
        String facultyID = GenericHelper.generateAnId();

        Faculty faculty = new Faculty.Builder().withFacultyID(facultyID).withName(name).withPhone(phone).build();

        return faculty;

    }
}
