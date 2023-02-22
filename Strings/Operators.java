package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // concatenated
        System.out.println('a'+3); // 100
        System.out.println((char)('a' + 3)); // d
        System.out.println("abhi"+new ArrayList<>()); // abhi[]
        System.out.println(new ArrayList<>(10) + "" + new ArrayList<>(10));
    }
}
