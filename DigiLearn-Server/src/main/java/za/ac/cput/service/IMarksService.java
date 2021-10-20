//  Author: Ridhaa Flanders - 218204191
package za.ac.cput.service;

import za.ac.cput.entity.Lecturer;
import za.ac.cput.entity.Marks;

import java.util.Set;

public interface IMarksService extends IService<Marks,String>{
    Set<Marks> getAll();
}
