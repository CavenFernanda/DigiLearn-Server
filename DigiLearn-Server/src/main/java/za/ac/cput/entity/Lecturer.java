package za.ac.cput.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lecturer {
    @Id
    private String id;
    private String firstName, lastName, lecturerEmail;

    protected Lecturer(){}

    private Lecturer(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.lecturerEmail = builder.lecturerEmail;
        this.id = builder.id;
    }

    public static class Builder {
        private String firstName, lastName, lecturerEmail;
        private String id;

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

        public Builder id(String id) {
            this.id = id;
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

    public String getId() {
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
}
