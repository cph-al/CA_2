package test;

import java.util.HashMap;
import javax.persistence.Persistence;

public class Builder
{
    public static void main(String[] args)
    {
        Persistence.generateSchema("CA_2_PU", null);
    }
}
