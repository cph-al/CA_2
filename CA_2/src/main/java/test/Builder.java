package test;

import java.util.HashMap;
import javax.persistence.Persistence;

public class Builder
{
    public static void main(String[] args)
    {
        HashMap<String,Object> PUproperties = new HashMap<>();
        PUproperties.put("javax.persistence.schema-generation.database.action", "drop-and-create");
        PUproperties.put("javax.persistence.sql-load-script-source", "scripts/ClearDB.sql");
        
        Persistence.generateSchema("CA_2_PU", PUproperties);
        Persistence.generateSchema("CA_2_PU", null);
    }
}
