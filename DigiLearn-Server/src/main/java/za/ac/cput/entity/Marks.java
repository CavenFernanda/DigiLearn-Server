//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.entity;

import javax.persistence.*;
@Entity
@Table(name = "marks")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark,student,lecturer;

    protected Marks(){}

    private Marks(Marks.Builder builder){
        this.mark = builder.mark;
        this.student = builder.student;
        this.lecturer = builder.lecturer;
        this.id = builder.id;
    }

    public static class Builder
    {
        private Long id;
        private String mark,student,lecturer;

        public Builder Id(Long id) {
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

    public Long getId() {
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
