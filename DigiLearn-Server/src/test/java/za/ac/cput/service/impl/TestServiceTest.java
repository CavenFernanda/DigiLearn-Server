package za.ac.cput.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.entity.ControlledTest;
import za.ac.cput.factory.TestFactory;
import

import java.util.Set;

@org.junit.jupiter.api.Test;

import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {
    @Autowired
    private static TestService service ;
    private static ControlledTest test=
            TestFactory.createTest("App Development");

    @ControlledTest
    public void a_create() {
        ControlledTest created = service.create(ControlledTest);
        assertEquals(created.getTestId(), ControlledTest.getTestId());
        System.out.println("Created" + created);
    }

    @ControlledTest
    public void b_read() {
        ControlledTest read =  service.read(ControlledTest.toString());
        System.out.println("Read: " + read);
    }

    @ControlledTest
    public void c_update() {
        ControlledTest updated = new ControlledTest.Builder().copy(ControlledTest).build();
        updated =  service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @ControlledTest
    public void f_delete() {
        boolean deleted = service.delete(ControlledTest.toString());
        assertTrue(deleted);
        System.out.println("Deleted: " + deleted);

    }

    @ControlledTest
    public void d_getAll() {
        Set<ControlledTest> Test = service.getAll();
        assertEquals(1, Test.size());
        System.out.println("Here are the Test : " + Test);
    }


}