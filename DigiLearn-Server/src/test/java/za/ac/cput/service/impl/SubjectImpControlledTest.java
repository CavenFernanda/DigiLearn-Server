package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import za.ac.cput.entity.Subject;
import za.ac.cput.factory.SubjectFactory;
import za.ac.cput.factory.SubjectFactory;
import za.ac.cput.service.SubjectService;
import za.ac.cput.service.SubjectService;


import org.springframework.beans.factory.annotation.Autowired;
//Author
import java.util.Set;



import static org.junit.jupiter.api.Assertions.*;

class SubjectImpControlledTest {

    @Autowired
    private static SubjectService service ;
    private static Subject Subject =
            SubjectFactory.createSubject("App Dev","50" );


    @Test
    public void d_getAll() {
        Set<Subject> Subject = service.getAll();
        assertEquals(1, Subject.size());
        System.out.println("Here are the Subjects : " + Subject);
    }

    @Test
    public void a_create() {
        Subject created =  service.create(Subject);
        Assert.assertEquals(Subject.toString(), created.toString());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        Subject read =  service.read(Subject.toString());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Subject updated = new Subject.Builder().copy(Subject).build();
        updated =  service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void f_delete() {
        boolean deleted = service.delete(Subject.toString());
        Assert.assertTrue(deleted);

    }
}