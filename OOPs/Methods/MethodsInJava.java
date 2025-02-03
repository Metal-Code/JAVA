package Methods;
import java.util.Scanner;

/*
* Methods is a function which is defined inside a class
* */

public class MethodsInJava
{
    static int sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        int c = sum(a,b);
        System.out.println("Sum of a and b is: "+sum(a,b));
    }
}
