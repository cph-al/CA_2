package Interface;

import entity.Person;
import java.util.List;

public interface PersonFacadeI
{

    boolean addPerson(Person p);

    Person getPerson(int id);

    List<Person> getPersons();
    
    List<Person> getPersons(int zip);

    boolean deletePerson(int id);
    
    boolean editPerson(Person p);
}
