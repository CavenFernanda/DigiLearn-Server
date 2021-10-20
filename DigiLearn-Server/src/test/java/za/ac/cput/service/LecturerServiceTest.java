//  Author: Ridhaa Flanders - 218204191
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
import za.ac.cput.entity.Subject;
import za.ac.cput.factory.LecturerFactory;
import za.ac.cput.factory.SubjectFactory;
import za.ac.cput.repository.LecturerRepository;

import javax.persistence.EntityManager;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

@EnableAutoConfiguration
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
@TestMethodOrder(MethodOrderer.MethodName.class)
class LecturerServiceTest {
    @Autowired
    private LecturerService lecturerService;

    private static za.ac.cput.entity.Subject Subject = SubjectFactory.createSubject("App Theory", "50");

    @Test
    void create() {
        Lecturer lecturer = LecturerFactory.build("john","Paul","Jones@gmail.com","karma");
        assertTrue(lecturerService.create(lecturer).getClass() == lecturer.getClass());
    }

    @Test
    void read() {
        Lecturer lecturer = LecturerFactory.build("john","Paul","Jones@gmail.com","karma");
        assertTrue(lecturerService.read(lecturer.getId()).getId() == lecturer.getId());
    }

    @Test
    void update() {
        Lecturer lecturer = LecturerFactory.build("john","Paul","Jones@gmail.com","karma");
        lecturerService.create(lecturer);
        lecturerService.update(lecturer);
        assertTrue(lecturerService.read(lecturer.getId()) == lecturer);
    }

    @Test
    void delete() {
        Lecturer lecturer = LecturerFactory.build("john","Paul","Jones@gmail.com","karma");
        lecturerService.create(lecturer);
        lecturerService.delete(lecturer.getId());
        assertTrue(lecturerService.read(lecturer.getId()) != lecturer);
    }

    @Test
    void findAll() {
    }
}