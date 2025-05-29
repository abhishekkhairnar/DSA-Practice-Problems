package Patterns;

public class Patterns {
    public static void main(String[] args) {
        int n=4;
        pattern2(n);
    }
    public static void pattern1(int n)
    {
        // the number of rows do you have that number of times outer loop will run
        for(int row = 1; row <= n; row++)
        {
            // check for every row there are how many columns and run loop that many times
            for(int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            // after printing every row we need to pring new line
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1 ; col <= n; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= n-row+1 ; col++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= row ; col++ )
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n)
    {
        for(int row = 1; row <= n*2; row++)
        {
            int columns = row > n ? 2 * n - row: row;
            for(int col = 1; col <= columns ; col++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n)
    {
        for(int row = 1; row <= n*2; row++)
        {
            int columns = row > n ? 2 * n - row: row;
            // add spaces in begining
            int noOfSpaces = n-columns;
            for(int s=0;s<noOfSpaces;s++)
            {
                System.out.print(" ");
            }
            for(int col = 1; col <= columns ; col++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int spaces = 0;spaces < n-row;spaces++)
            {
                System.out.print(" ");
            }
            for(int col = row; col >= 1;col--)
            {
                System.out.print(col);
            }
            for(int col = 2; col <= row;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern8(int n)
    {
        for(int row=1;row<=n*2;row++)
        {
            int c = row > n ? 2 * n - row: row;
            for(int spaces = 0;spaces < n-c;spaces++)
            {
                System.out.print(" ");
            }
            for(int col = c; col >= 1;col--)
            {
                System.out.print(col);
            }
            for(int col = 2; col <= c;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern9(int n)
    {
        for(int row=1;row<=2*n;row++)
        {
            
        }
    }


}
