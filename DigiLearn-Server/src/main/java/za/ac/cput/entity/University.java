package za.ac.cput.entity;

/*
 *Author: Caven Fernanda 218074905
 * Entity class for Student
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "university")
public class University {

    @Id
    private String id;
    private String name;
    private String city;
    private String address;

    private University(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.city = builder.city;
        this.address = builder.address;
    }

    public static class Builder{
        private String id;
        private String name;
        private String city;
        private String address;

        public Builder(){}

        public Builder withUniversityID(String id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public University build(){
            return new University(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "universityID=" + id +
                    ", name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }
}
