package za.ac.cput.factory;

/**Author: Mathew Fortuin 219069514
 * Factory class for Subject
 **/

import za.ac.cput.entity.Subject;
import za.ac.cput.util.GenericHelper;




public class SubjectFactory
{

    public static Subject createSubject(String subjectName, String subjectCredits)
    {
        String subjectId = GenericHelper.generateAnId();
        String lectureId = GenericHelper.generateAnId();


        Subject subject = new Subject.Builder()
                .setSubjectId(subjectId)
                .setSubjectName(subjectName)
                .setSubjectCredits(subjectCredits)
                .setLectureId(lectureId).build();


        return subject;
    }
}
