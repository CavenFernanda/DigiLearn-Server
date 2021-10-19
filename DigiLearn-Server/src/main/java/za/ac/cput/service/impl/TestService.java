package za.ac.cput.service.impl;

import za.ac.cput.entity.ControlledTest;
import za.ac.cput.repository.TestRepository;
import za.ac.cput.service.ITestService;

import java.util.Set;

public class TestService implements ITestService {

    private static TestService testService = null;
    private TestRepository testRepository = null;
    private TestService(){

        this.testRepository = TestRepository.getRepository();
    }

    public static TestService getService(){
        if(testService == null)
            testService = new TestService();
        return testService;
    }

    @Override
    public ControlledTest create(ControlledTest test) {
        return this.testRepository.create(test);
    }

    @Override
    public ControlledTest read(String testId) {
        return this.testRepository.read(testId);
    }

    @Override
    public ControlledTest update(ControlledTest test) {
        return this.testRepository.update(test);
    }

    @Override
    public boolean delete(String testId) {
        return this.testRepository.delete(testId);
    }

    @Override
    public Set<ControlledTest> getAll() {
        return this.testRepository.getAll();
    }
}
