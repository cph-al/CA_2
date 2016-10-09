package facade;

import entity.Person;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonFacadeTest
{

    static PersonFacade pf = new PersonFacade();

    public PersonFacadeTest()
    {

    }

    @BeforeClass
    public static void setUpClass()
    {
        Person p = new Person("Det", "Virker");
        pf.addPerson(p);
        Person p1 = new Person("Måske", "Ikke");
        pf.addPerson(p1);
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }

    @Test
    public void testAddPerson()
    {
        System.out.println("addPerson");
        Person p = new Person();
        Person expResult = new Person("Test", "Testing");
        int id = 3;
        expResult.setId(id);
        p.setFirstName("Test");
        p.setLastName("Testing");
        pf.addPerson(p);
        assertEquals(expResult.getId(), p.getId());
    }

    @Test
    public void testGetPerson()
    {
        System.out.println("getPerson");
        Person expResult = new Person("Faktisk", "Aldrig");
        pf.addPerson(expResult);
        int id = 4;
        Person result = pf.getPerson(id);
        assertEquals(expResult.getLastName(), result.getLastName());
    }
    
    @Test
    public void testDeletePerson()
    {
        System.out.println("deletePerson");
        int id = 2;
        boolean expResult = true;
        boolean result = pf.deletePerson(id);
        assertEquals(expResult, result);
    }

    /**
    @Test
    public void testGetPersonInfo()
    {
        System.out.println("getPersonInfo");
        int id = 0;
        PersonFacade instance = new PersonFacade();
        Person expResult = null;
        Person result = instance.getPersonInfo(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPersons_int()
    {
        System.out.println("getPersons");
        int zip = 0;
        PersonFacade instance = new PersonFacade();
        List<Person> expResult = null;
        List<Person> result = instance.getPersons(zip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testEditPerson()
    {
        System.out.println("editPerson");
        Person p = null;
        PersonFacade instance = new PersonFacade();
        boolean expResult = false;
        boolean result = instance.editPerson(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
