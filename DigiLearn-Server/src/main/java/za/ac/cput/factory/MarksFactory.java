//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.factory;

import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Marks;
import za.ac.cput.util.GenericHelper;

public class MarksFactory {
    public static Marks build(String mark, String student, String lecturer)
    {
        String id = GenericHelper.generateAnId();
        if(student.isEmpty() || lecturer.isEmpty())
        {
            return null;
        }
        return new Marks.Builder().Id(id).Student(student).Mark(mark).Lecturer(lecturer).build();
    }
}
