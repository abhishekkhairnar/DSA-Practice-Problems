public class Fibo {
    public static void main(String[] args) {
        System.out.println(fiboformula(50));   
    }
    public static int fiboformula(int n)
    {
        return (int)(( 1/Math.sqrt(5) * Math.pow((1+Math.sqrt(5))/2,n))- 1/Math.sqrt(5) * Math.pow((1-Math.sqrt(5))/2,n) );
    }
}
