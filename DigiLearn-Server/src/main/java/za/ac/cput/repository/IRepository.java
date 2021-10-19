package za.ac.cput.repository;

@Deprecated
public interface  IRepository <Subject, String> {
    Subject create (Subject s);
    Subject read (String id);
    Subject update (Subject s);
    boolean delete (String id);
}
