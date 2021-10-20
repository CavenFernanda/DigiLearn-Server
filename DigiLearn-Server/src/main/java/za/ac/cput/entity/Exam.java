package za.ac.cput.entity;
/*
 *Author: Athi Fukama 218328591
 * Entity class for Exam
 */

import java.io.Serializable;

public class Exam implements Serializable
{

    private String examId;
    private String lecturerId;
    private String examInfo;


    protected Exam(){
}

    private Exam(Exam.Builder builder){
    this.examId = builder.examId;
    this.lecturerId = builder.lecturerId;
    this.examInfo = builder.examInfo;

}

    @Override
    public String toString() {
        return "Exam{" +
                "examId='" + examId + '\'' +
                ", lecturerId='" + lecturerId + '\'' +
                ", examInfo='" + examInfo + '\'' +
                '}';
    }

    public String getExamId() {
        return examId;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public String getExamInfo() {
        return examInfo;
    }


    public static class Builder{
        private String examId;
        private String lecturerId;
        private String examInfo;


        public Builder setExamId(String examId) {
            this.examId = examId;
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
            this.examId= exam.examId;
            this.lecturerId = exam.lecturerId;
            this.examInfo = exam.examInfo;
            return this;
        }



    }

}
