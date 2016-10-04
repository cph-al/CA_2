package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private int pNumber;
    private String pDesc;
    
    @ManyToOne
    private InfoEntity ie;
    
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getPhoneNumber()
    {
        return pNumber;
    }

    public void setPhoneNumber(int pNumber)
    {
        this.pNumber = pNumber;
    }

    public String getPhoneDesc()
    {
        return pDesc;
    }

    public void setPhoneDesc(String pDesc)
    {
        this.pDesc = pDesc;
    }
}
