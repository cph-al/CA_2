package test;

import entity.Person;
import facade.PersonFacade;


public class FacadeTester
{
    public static void main(String[] args)
    {
        PersonFacade pf = new PersonFacade();
        Person p = new Person();
        p.setFirstName("Laura");
        p.setLastName("Hartig");
        p.setEmail("laur2012@hotmail.com");
        pf.addPerson(p);
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
