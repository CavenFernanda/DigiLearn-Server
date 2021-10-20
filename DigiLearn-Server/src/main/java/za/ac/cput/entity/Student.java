package za.ac.cput.entity;
/*
 *Author: Athi Fukama 218328591
 * Entity class for Student
 */
import java.io.Serializable;
public class Student implements Serializable{

    private String studentId;
    private String firstName;
    private String lastName;
    private String studentEmail;
    private String courseId;


    protected Student(){
    }

    private Student(Student.Builder builder){
        this.studentId = builder.studentId;
        this.firstName= builder.firstName;
        this.lastName = builder.lastName;
        this.studentEmail = builder.studentEmail;
        this.courseId = builder.courseId;

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", courseId='" + courseId + '\'' +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getCourseId() {
        return courseId;
    }



    public static class Builder{
        private String studentId;
        private String firstName;
        private String lastName;
        private String studentEmail;
        private String courseId;

        public Student.Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Student.Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Student.Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Student.Builder setStudentEmail(String studentEmail) {
            this.studentEmail = studentEmail;
            return this;
        }
        public Student.Builder setCourseId(String courseId) {
            this.studentId = studentId;
            return this;
        }


        public Student build(){
            return new Student(this);
        }

        public Student.Builder copy(Student student){
            this.studentId = student.studentId;
            this.firstName= student.firstName;
            this.lastName = student.lastName;
            this.studentEmail = student.studentEmail;
            this.courseId = student.studentId;

            return this;
        }


    }

}
