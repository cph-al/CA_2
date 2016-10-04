package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Hobby implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String hName;
    private String hDesc;
    
    @ManyToMany
    List<Person> persons = new ArrayList();

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getHobbyName()
    {
        return hName;
    }

    public void setHobbyName(String hName)
    {
        this.hName = hName;
    }

    public String getHobbyDesc()
    {
        return hDesc;
    }

    public void setHobbyDesc(String hDesc)
    {
        this.hDesc = hDesc;
    }  
}
