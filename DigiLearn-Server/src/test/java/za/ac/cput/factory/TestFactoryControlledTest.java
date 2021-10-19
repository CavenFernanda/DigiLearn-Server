package za.ac.cput.factory;




import za.ac.cput.entity.ControlledTest;

class TestFactoryControlledTest {
    @org.junit.jupiter.api.Test
    void createTest() {
        ControlledTest test = TestFactory.createTest("Applications Development");
        System.out.println(test);
    }

}