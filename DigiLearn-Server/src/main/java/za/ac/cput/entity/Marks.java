//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.entity;

import javax.persistence.*;
@Entity
@Table(name = "marks")
public class Marks {
    @Id
    private String id;
    private String mark,student,lecturer;

    protected Marks(){}

    private Marks(Marks.Builder builder){
        this.id = builder.id;
        this.mark = builder.mark;
        this.student = builder.student;
        this.id = builder.id;
    }

    public static class Builder
    {
        private String id;
        private String mark,student,lecturer;

        public Builder Id(String id) {
            this.id = id;
            return this;
        }

        public Builder Mark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder Student(String student) {
            this.student = student;
            return this;
        }

        public Builder Lecturer(String lecturer) {
            this.lecturer = lecturer;
            return this;
        }

        public Marks build() {
            return new Marks(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getStudent() {
        return student;
    }

    public String getLecturer() {
        return lecturer;
    }
}
