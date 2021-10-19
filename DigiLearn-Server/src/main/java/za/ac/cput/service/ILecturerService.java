package za.ac.cput.service;

import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Subject;

import java.util.Set;

public interface ILecturerService extends IService<Lecturer,String>{
    Set<Lecturer> getAll();
}
