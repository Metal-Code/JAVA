package Methods;
import java.util.Scanner;

public class Recursion
{
    static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }


    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the number whose factorial you want: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+factorial(n));
    }
}
