package za.ac.cput.repository;


import za.ac.cput.entity.ControlledTest;

import java.util.HashSet;
import java.util.Set;

public class TestRepository implements ITestRepository {

    private static TestRepository repository = null;
    private Set<ControlledTest> testDB= null;

    private TestRepository() {
        testDB = new HashSet<ControlledTest>();
    }

    public static TestRepository getRepository(){
        if(repository == null)
            repository = new TestRepository();
        return repository;
    }

    @Override
    public ControlledTest create(ControlledTest test) {
        boolean success = this.testDB.add(test);
        if(!success)
            return null;

        return test;
    }

    @Override
    public ControlledTest read(String TestId) {

        for (ControlledTest test : this.testDB) {
            String testId;
            if (test.getTestId().equalsIgnoreCase(TestId))
                return test;
        }

        return null;
    }

    @Override
    public ControlledTest update(ControlledTest test) {
        ControlledTest preUpdate = read(test.getTestId());

        if (preUpdate != null) {
            this.testDB.remove(preUpdate);
            this.testDB.add(test);
            return test;
        }

        return null;
    }

    @Override
    public boolean delete(String testId) {
        ControlledTest testToDelete = read(testId);

        if (testToDelete != null) {
            this.testDB.remove(testToDelete);
            return true;
        }
        return false;
    }

    @Override
    public Set<ControlledTest> getAll() {
        return testDB;
    }
}

