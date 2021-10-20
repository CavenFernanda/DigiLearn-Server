package za.ac.cput.entity;
/*
 *Author: Athi Fukama 218328591
 * Entity class for Student
 */
/*
 *Author: Athi Fukama 218328591
 * Entity class for Student
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "student")
public class Student{

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String studentEmail;
    private String courseId;


    protected Student(){
    }

    private Student(Student.Builder builder){
        this.id = builder.id;
        this.firstName= builder.firstName;
        this.lastName = builder.lastName;
        this.studentEmail = builder.studentEmail;
        this.courseId = builder.courseId;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", courseId='" + courseId + '\'' +
                '}';
    }

    public String getId() {
        return id;
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
        private String id;
        private String firstName;
        private String lastName;
        private String studentEmail;
        private String courseId;

        public Student.Builder setId(String id) {
            this.id = id;
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
            this.courseId = courseId;
            return this;
        }


        public Student build(){
            return new Student(this);
        }

        public Student.Builder copy(Student student){
            this.id = student.id;
            this.firstName= student.firstName;
            this.lastName = student.lastName;
            this.studentEmail = student.studentEmail;
            this.courseId = student.courseId;

            return this;
        }



    }

}
