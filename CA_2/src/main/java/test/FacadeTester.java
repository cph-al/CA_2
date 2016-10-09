package test;

import entity.Hobby;
import entity.Person;
import entity.Phone;
import facade.PersonFacade;
import java.util.Arrays;

public class FacadeTester
{
    public static void main(String[] args)
    {
        PersonFacade pf = new PersonFacade();
        Person p = new Person();
        Phone phone = new Phone();
        Hobby hobby = new Hobby();
        phone.setpNumber(22334455);
        phone.setpDesc("pro");
        p.setFirstName("Laura");
        p.setLastName("Hartig");
        p.setEmail("laur2012@hotmail.com");
        //pf.addPerson(p);
        pf.addPhone(phone, p);
        
        
        Person p1 = new Person();
        p1.setFirstName("Hai");        
        p1.setLastName("Fag");
        pf.addPerson(p1);
        Person p2 = new Person();
        p2.setId(2);
        p2.setFirstName("Bro");
        p2.setLastName("Cho");
        pf.editPerson(p2);
    }
}
