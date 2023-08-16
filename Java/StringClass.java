public class StringClass {
    public static void main(String[] args) {
        char[]c={'a','b','c'};
        String s = new String(c);
        System.out.println(s);

        byte[]b={65,66,64,63,62,67,68};
        String s1 = new String(b);
        System.out.println(s1);

        System.out.println(s1.lastIndexOf("@?"));

    }
}
