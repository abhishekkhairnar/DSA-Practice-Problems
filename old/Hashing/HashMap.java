import java.util.*;
public class HashMap
{
    HashMap<String,Integer> m = new HashMap<String,Integer>();
    m.put("abhishek",1);
    m.put("shweta",2);
    m.put("tanmay",3);
    System.out.println(m);
    System.out.println(m.size());
    for(Map.Entry<String,Integer>e:m.entrySet())
    {
        System.out.println(e.getKey()+" "+e.getValue());
    }
}