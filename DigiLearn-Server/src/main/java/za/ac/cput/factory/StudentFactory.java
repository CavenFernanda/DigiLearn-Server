package za.ac.cput.factory;
/*
 *Author: Athi Fukama 218328591
 * Factory class for Student
 */
import za.ac.cput.entity.Student;
import za.ac.cput.util.GenericHelper;

public class StudentFactory {
    public static Student createStudent(String firstName, String lastName, String studentEmail, String courseId){
        String studentId = GenericHelper.generateAnId();
        Student student = new Student.Builder()
                .setId(studentId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setStudentEmail(studentEmail)
                .setCourseId(courseId)
                .build();

        return student;
    }


}