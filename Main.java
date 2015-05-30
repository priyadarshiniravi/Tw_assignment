//import java.util.concurrent.SynchronousQueue;
import java.util.*;


public class Main {
    public static void asterisk()
    {
        System.out.println("*");
    }

    public static void horizontal(int n)
    {   int i;
        for(i=0;i<n;i++)
        {
            System.out.print("*");
        }
    }
    public static void vertical(int n)
    {   int i;
        for(i=0;i<n;i++)
        {
            System.out.println("*");
        }
    }
    public static void right_triangle(int n)
    {   int i,j;
        for(i=0;i<n;i++)
        {   for(j=0;j<=i;j++) {
            System.out.print("*");
        }
            System.out.println();
        }
    }
    public static void iso_triangle(int n)
    {   int i,j=1,k;
        int total=2*(n-1)+1;
        for(i=1;i<=n;i++)
        {
            int spaces=total-j;
            int space_two=(total-j)/2;
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            for(k=0;k<j;k++) {
                System.out.print("*");
            }
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            System.out.println();

            //System.out.print("*");
            j=j+2;

        }
    }

    public static void diamond(int n)
    {   int i,j=1,k;
        int total=2*(n-1)+1;
        //int m=total;
        for(i=1;i<=n;i++)
        {
            int spaces=total-j;
            int space_two=(total-j)/2;
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            for(k=0;k<j;k++) {
                System.out.print("*");
            }
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            System.out.println();

            //System.out.print("*");
            j=j+2;

        }
        j=total-2;
        //System.out.println(total+" "+n);
        for(i=1;i<=n-1;i++)
        {
            int spaces=total-j;
            int space_two=(total-j)/2;
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            for(k=0;k<j;k++) {
                System.out.print("*");
            }
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            System.out.println();

            //System.out.print("*");
            j=j-2;

        }


    }

    public static void diamond_name(int n,String name)
    {   int i,j=1,k;
        int total=2*(n-1)+1;
        //int m=total;
        for(i=1;i<=n-1;i++)
        {
            int spaces=total-j;
            int space_two=(total-j)/2;
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            for(k=0;k<j;k++) {
                System.out.print("*");
            }
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            System.out.println();

            //System.out.print("*");
            j=j+2;

        }
        System.out.println(name);
        j=total-2;
        //System.out.println(total+" "+n);
        for(i=1;i<=n-1;i++)
        {
            int spaces=total-j;
            int space_two=(total-j)/2;
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            for(k=0;k<j;k++) {
                System.out.print("*");
            }
            for(k=0;k<space_two;k++) {
                System.out.print(" ");
            }
            System.out.println();

            //System.out.print("*");
            j=j-2;

        }


    }
    public static void FizzBuzz(int n)
    {int i;
        for(i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");

            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }

        }
    }


    public static ArrayList prime_factor(int n)
    {   int i,j;
        ArrayList al = new ArrayList();
        for(i=2;i<Math.sqrt(n);i++)
        { boolean flag=true;
           for(j=2;j<i;j++)
           {if(i%j==0)
           {
               flag=false;
           }

           }
            if(flag==true && n%i==0)
            {   al.add(i);
                //System.out.print(i+" ");
            }
        }

        return al;

    }

    public static void main(String[] args) {

        asterisk();
        System.out.println();
        horizontal(8);
        System.out.println();
        vertical(3);
        System.out.println();
        right_triangle(3);
        System.out.println();
        iso_triangle(5);
        System.out.println();
        diamond(5);
        System.out.println();
        diamond_name(5, "priya");
        System.out.println();
        FizzBuzz(100);
        System.out.println();
        System.out.println(prime_factor(625));
    }
}
