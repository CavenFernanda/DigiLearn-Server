package za.ac.cput.entity;
/*
 *Author: Athi Fukama 218328591
 * Entity class for Exam
 */
/*
 *Author: Athi Fukama 218328591
 * Entity class for Exam
 */
/*
 *Author: Athi Fukama 218328591
 * Entity class for Exam
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam
{
    @Id
    private String id;
    private String lecturerId;
    private String examInfo;


    protected Exam(){
    }

    private Exam(Exam.Builder builder){
        this.id = builder.id;
        this.lecturerId = builder.lecturerId;
        this.examInfo = builder.examInfo;

    }

    @Override
    public String toString() {
        return "Exam{" +
                "Id='" + id + '\'' +
                ", lecturerId='" + lecturerId + '\'' +
                ", examInfo='" + examInfo + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public String getExamInfo() {
        return examInfo;
    }

    public static class Builder{
        private String id;
        private String lecturerId;
        private String examInfo;


        public Builder setExamId(String examId) {
            this.id = id;
            return this;
        }

        public Builder setLecturerId(String lecturerId) {
            this.lecturerId = lecturerId;
            return this;
        }

        public Builder setExamInfo(String examInfo) {
            this.examInfo = examInfo;
            return this;
        }

        public Exam build(){
            return new Exam(this);
        }

        public Builder copy(Exam exam){
            this.id= exam.id;
            this.lecturerId = exam.lecturerId;
            this.examInfo = exam.examInfo;
            return this;
        }



    }

}
