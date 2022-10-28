public class ClearBit{
    public static void main(String[]args){
        int n=5;
        int pos = 0;
        int bitmask = 1<<pos;
        int not = ~(bitmask);
        System.out.println(not & n);
    }
}