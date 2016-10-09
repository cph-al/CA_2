package Interface;

import entity.Hobby;
import entity.Person;
import entity.Phone;
import java.util.List;

public interface PersonFacadeI
{

    Person addPerson(Person p);

    Person getPerson(int id);

    List<Person> getPersons();
    
    List<Person> getPersons(int zip);

    boolean deletePerson(int id);
    
    boolean editPerson(Person p);
    
    boolean addHobby(Hobby hobby, Person p);
    
    boolean addPhone(Phone phone, Person p);
}
