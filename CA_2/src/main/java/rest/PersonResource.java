package rest;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import entity.Person;
import facade.PersonFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("person/complete")
public class PersonResource
{

    @Context
    private UriInfo context;

    public PersonResource()
    {
    }
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersons()
    {
         Gson gson = new com.google.gson.GsonBuilder().create();
         PersonFacade pf = new PersonFacade();
         return gson.toJson(pf.getPersons());
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPerson(@PathParam("id") int id)
    {
        Gson gson = new com.google.gson.GsonBuilder().create();
        JsonObject jo = new JsonObject();
        PersonFacade pf = new PersonFacade();
        Person p = pf.getPerson(id);
        jo.addProperty("firstName", p.getFirstName());
        jo.addProperty("lastName", p.getLastName());
        String response = gson.toJson(jo);
        return response;   
    }
    
 
    /**
     * PUT method for updating or creating an instance of PersonResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content)
    {
    }
}
