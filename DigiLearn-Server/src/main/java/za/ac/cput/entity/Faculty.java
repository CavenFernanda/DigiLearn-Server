package za.ac.cput.entity;

/* Faculty.java
   Entity for Faculty
   Author: Caven Fernanda - 218074905
   Date: 05 June 2021
 */

import javax.persistence.*;
@Entity
@Table(name = "Faculty")
public class Faculty {

    @Id
    private final String id;
    private final String name;
    private final String phone;

    private Faculty(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    public static class Builder {

        private String id;
        private String name;
        private String phone;

        public Faculty build(){
            return new Faculty(this);
        }

        public Builder withFacultyID(String facultyID) {
            this.id = facultyID;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }
    }


    @Override
    public String toString() {
        return "Faculty{" +
                "facultyID=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
