package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Address implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String street;
    private String addressInfo;
    
    @ManyToOne
    private CityInfo ci;
    @OneToMany(cascade = CascadeType.PERSIST)
    List<InfoEntity> ie = new ArrayList();

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getAddressInfo()
    {
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo)
    {
        this.addressInfo = addressInfo;
    }
}