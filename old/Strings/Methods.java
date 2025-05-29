package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String a = "Abhishek naresh khairnar";
        String b = "Abhishek";
        System.out.println(Arrays.toString(a.toCharArray()));
        System.out.println(a.hashCode());
        System.out.println(a.codePointAt(0)); // prints ascii code at particular index
        System.out.println(a.codePointBefore(1));
        System.out.println(a.compareTo(b));
        System.out.println(b.toLowerCase());
        System.out.println(a.indexOf("naresh"));
        System.out.println("         abhi           ".strip());
        System.out.println(Arrays.toString(a.split("a")));
    }
}
