package facade;

import Interface.PersonFacadeI;
import entity.Hobby;
import entity.Person;
import entity.Phone;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class PersonFacade implements PersonFacadeI
{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2_PU");

    @Override
    public Person addPerson(Person p)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return p;
        } finally
        {
            em.close();
        }
    }

    @Override
    public Person getPerson(int id)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            Person p = em.find(Person.class, id);
            em.getTransaction().commit();
            return p;
        } finally
        {
            em.close();
        }
    }
    
    @Override
    public List<Person> getPersons()
    {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Person> persons = em.createQuery("SELECT p FROM Person p", Person.class);
        return persons.getResultList();
    }

    @Override
    public List<Person> getPersons(int zip)
    {
        List<Person> pl = new ArrayList();
        return pl;
    }

    @Override
    public boolean deletePerson(int id)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            Person p = em.find(Person.class, id);
            if (p != null)
            {
                em.remove(p);
                em.getTransaction().commit();
                return true;
            } else
            {
                return false;
            }
        } finally
        {
            em.close();
        }
    }

    @Override
    public boolean editPerson(Person p)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
            return true;
        } finally
        {
            em.close();
        }
    }

    @Override
    public boolean addHobby(Hobby hobby, Person p) {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            p.hobby.add(hobby);
            hobby.person.add(p);
            em.merge(p);
            em.merge(hobby);
            em.getTransaction().commit();
            return true;
        } finally
        {
            em.close();
        }
    }

    @Override
    public boolean addPhone(Phone phone, Person p) {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            p.phone.add(phone);
            phone.setIe(p);
            em.merge(p);
            em.merge(phone);
            em.getTransaction().commit();
            return true;
        } finally
        {
            em.close();
        }
    }
    
}
