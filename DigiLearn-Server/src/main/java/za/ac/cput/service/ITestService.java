package za.ac.cput.service;

import za.ac.cput.entity.ControlledTest;

import java.util.Set;

public interface ITestService extends IService <ControlledTest, String> {
    public Set<ControlledTest> getAll();
}
