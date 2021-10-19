package za.ac.cput.repository;



import za.ac.cput.entity.ControlledTest;

import java.util.Set;

public interface ITestRepository extends IRepository <ControlledTest, String>{
    public Set<ControlledTest> getAll();
}
