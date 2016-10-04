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
        pf.addPerson(p);
    }
}
