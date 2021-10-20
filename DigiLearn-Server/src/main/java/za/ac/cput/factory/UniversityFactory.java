package za.ac.cput.factory;
/**Author: Caven Fernanda 218074905
 * Factory class for University
 **/

import za.ac.cput.entity.University;
import za.ac.cput.util.GenericHelper;

public class UniversityFactory {

    public static University buildUniversity(String name, String city, String address){
        String universityID = GenericHelper.generateAnId();

        return new University.Builder().withUniversityID(universityID).withName(name).withCity(city).withAddress(address).build();
    }

}
