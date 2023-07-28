import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.stream.Stream;
import java.util.*;

public class BufferReaderDemo {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // char c[] = new char[10];
        // String arr[] = br.readLine().split(" ");

        // for(String s :arr){
        //     System.out.println(s);
        // }
        // // br.read(c); 
        // String s = System.console().readLine();
        // System.out.println(s);
        // System.out.println(c);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        String arrStr[] = br.readLine().split(" ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
