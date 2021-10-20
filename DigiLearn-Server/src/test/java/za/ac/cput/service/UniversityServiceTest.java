package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.University;
import za.ac.cput.factory.LecturerFactory;
import za.ac.cput.factory.UniversityFactory;

import static org.junit.jupiter.api.Assertions.*;

@EnableAutoConfiguration
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
@TestMethodOrder(MethodOrderer.MethodName.class)
class UniversityServiceTest {

    @Autowired
    private UniversityService universityService;

    private static za.ac.cput.entity.University university = UniversityFactory.buildUniversity("Cape Peninsula University of Technology", "Cape Town","Hanover St, Zonnebloem, Cape Town, 7925");

    @Test
    void read(){

        University university = UniversityFactory.buildUniversity("Cape Peninsula University of Technology", "Cape Town","Hanover St, Zonnebloem, Cape Town, 7925");
        assertTrue(universityService.read(university.getId()).getId() == university.getId());
    }

    @Test
    void update() {
        University university = UniversityFactory.buildUniversity("Cape Peninsula University of Technology", "Cape Town","Hanover St, Zonnebloem, Cape Town, 7925");
        universityService.create(university);
        universityService.update(university);
        assertTrue(universityService.read(university.getId()) == university);
    }

    @Test
    void delete() {
        University university = UniversityFactory.buildUniversity("Cape Peninsula University of Technology", "Cape Town","Hanover St, Zonnebloem, Cape Town, 7925");
        universityService.create(university);
        universityService.delete(university.getId());
        assertTrue(universityService.read(university.getId()) != university);
    }

    @Test
    void findAll() {
    }
}