package za.ac.cput.entity;

//Author: Mathew Fortuin - 219069514
//Entity class for Subject
//10/10/21

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Subject implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "subID",nullable = false,unique = true,length =10)
    private String subjectId;
    @Column(name = "subName",nullable = false,unique = true,length =40)
    private String subjectName;
    @Column(name = "subCredits",nullable = false,unique = true,length =10)
    private String subjectCredits;
    @Column(name = "lecID",nullable = false,unique = true,length =10)
    private String lectureId;


    protected Subject(){
    }

    private Subject(Subject.Builder builder){
        this.subjectId = builder.subjectId;
        this.subjectName= builder.subjectName;
        this.subjectCredits = builder.subjectCredits;
        this.lectureId = builder.lectureId;

    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId='" + subjectId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectCredits='" + subjectCredits + '\'' +
                ", lectureId='" + lectureId + '\'' +
                '}';
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCredits() {
        return subjectCredits;
    }

    public String getLectureId() {
        return lectureId;
    }

    public static class Builder{
        private String subjectId;
        private String subjectName;
        private String subjectCredits;
        private String lectureId;



        public Builder setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }

        public Builder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public Builder setSubjectCredits(String subjectCredits) {
            this.subjectCredits = subjectCredits;
            return this;
        }

        public Builder setLectureId(String lectureId) {
            this.lectureId = lectureId;
            return this;
        }

        public Subject build(){
            return new Subject(this);
        }

        public Builder copy(Subject subject){
            this.subjectName= subject.subjectName;
            this.subjectId = subject.subjectId;
            this.subjectCredits = subject.subjectCredits;
            this.lectureId = subject.lectureId;

            return this;
        }


    }

}
