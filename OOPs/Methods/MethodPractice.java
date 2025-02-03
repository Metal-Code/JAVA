package Methods;
import java.util.Scanner;

public class MethodPractice
{
    static void mulTable(int n)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }

    static void pattern(int n)
    {
        for (int i=0;i<n;i++)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n + sum(n-1);
        }
    }

    static int fib(int n)
    {
        /*
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
        {
            return  fib(n-1)+ fib(n-2);
        }
        */
        //more better way
        if(n==1 || n==2)
            return n-1;
        else
        {
            return  fib(n-1)+ fib(n-2);
        }
    }

    static int avgParameters(int ...arr)
    {
        int sum = 0;
        for(int a:arr)
        {
            sum +=a;
        }
        return sum;
    }


    static void patternRecursion(int n)
    {
        if(n>0)
        {
            patternRecursion(n-1);
            for (int i=0; i<n; i++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*

        System.out.println("Enter the number whose mul table you want: ");
        int n = sc.nextInt();
        mulTable(n);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        pattern(n);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("The sum of first "+n+" natural numbers is: "+result);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println("The nth term of fibonacci series is: "+result);

        int result = avgParameters(1,2,4,5,6);
        System.out.println("Sum of paramters is: "+result);
        */

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        patternRecursion(n);
    }

}
