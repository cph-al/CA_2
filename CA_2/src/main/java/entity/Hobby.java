package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hobby implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String hName;
    private String hDesc;

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
