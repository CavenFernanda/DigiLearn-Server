//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.entity;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
@Entity
@Table(name = "lecturer")
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName, lastName, lecturerEmail, password;

    protected Lecturer(){}

    private Lecturer(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.lecturerEmail = builder.lecturerEmail;
        this.password = builder.password;
        this.id = builder.id;
    }

    public static class Builder {
        private String firstName, lastName, lecturerEmail, password;
        private Long id;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lecturerEmail(String lecturerEmail) {
            this.lecturerEmail = lecturerEmail;
            return this;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder password(String password)
        {
            this.password = password;
            return this;
        }

        public Lecturer build() {
            return new Lecturer(this);
        }
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lecturerEmail='" + lecturerEmail + '\'' +
                ", id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLecturerEmail() {
        return lecturerEmail;
    }

    public String getPassword() {
        return password;
    }


}
