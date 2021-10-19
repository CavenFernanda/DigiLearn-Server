package za.ac.cput.service;

public interface IService <Subject, String> {
    Subject create (Subject s);
    Subject read (String id);
    Subject update (Subject s);
    boolean delete (String id);
}
