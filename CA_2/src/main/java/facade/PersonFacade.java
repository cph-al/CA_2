package facade;

import Interface.PersonFacadeI;
import entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonFacade implements PersonFacadeI
{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CA_2_PU");

    @Override
    public boolean addPerson(Person p)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return true;
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
        try
        {
            List<Person> pl = new ArrayList();
            int i = 0;
            while (true)
            {
                Person p = em.find(Person.class, i);
                if (p != null)
                {
                    pl.add(p);
                    i++;
                } else
                {
                    break;
                }
            }
            return pl;
        } finally
        {
            em.close();
        }
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
    public boolean editPerson(Person p, int id)
    {
        EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            Person person = em.find(Person.class, id);
            if (person != null)
            {
                person = p;
                em.merge(person);
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
}
