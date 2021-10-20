package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import za.ac.cput.entity.Faculty;
import za.ac.cput.factory.FacultyFactory;


import static org.junit.jupiter.api.Assertions.*;

    @EnableAutoConfiguration
    @DataJpaTest
    @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
    @Rollback(false)
    @TestMethodOrder(MethodOrderer.MethodName.class)
    class FacultyServiceTest {

        @Autowired
        private FacultyService facultyService;

        private static za.ac.cput.entity.Faculty faculty = FacultyFactory.buildFaculty("Informatics and Design","0219596767");

        @Test
        void read(){

            Faculty faculty = FacultyFactory.buildFaculty("Informatics and Design","0219596767");
            assertTrue(facultyService.read(faculty.getId()).getId() == faculty.getId());
        }

        @Test
        void update() {
            Faculty faculty = FacultyFactory.buildFaculty("Informatics and Design","0219596767");
            facultyService.update(faculty);
            assertTrue(facultyService.read(faculty.getId()) == faculty);
        }

        @Test
        void delete() {
            Faculty faculty = FacultyFactory.buildFaculty("Informatics and Design","0219596767");
            facultyService.delete(faculty.getId());
            assertTrue(facultyService.read(faculty.getId()) != faculty);
        }

        @Test
        void findAll() {
        }
}