import java.util.Arrays;

// import InterruptedException;
class A implements Runnable{
    public void run()
    {
        try
        {
            System.out.println("Before waiting...");
            wait();
            System.out.println("After waiting");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        // Runnable r = new A();
        // Thread t=new Thread(r);
        // t.start();
        // int num = 1234;
        // String str = Integer.toString(num);
        // System.out.println(str);
        // String s = "   this is a wild     ";
        // System.out.println(s);
        // s.trim();
        // System.out.println(s);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
    }    
}
