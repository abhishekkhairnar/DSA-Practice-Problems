import java.util.*;
public class Hashset
{
    public static void main(String[]args)
    {
        HashSet<Integer> h = new HashSet<>();
        h.add(2);
        h.add(3);
        h.add(7);
        h.add(9);
        System.out.println(h.contains(2));
        System.out.println(h.contains(5));
        System.out.println(h.size());
        System.out.println(h.remove(3));
        System.out.println(h.isEmpty());
        h.clear();// makes hashset empty
        Iterator<Integer> i = h.iterator();
        while(i.hasNext())
            System.out.println(i.next()+" ");
    }
}