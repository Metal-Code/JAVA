package Abstract;
import java.util.Scanner;

abstract class pen
{
    abstract void write();
    abstract void refill();
}

class trimax extends pen
{
    public void write()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you wanna write with the pen: ");
        String sentence = sc.nextLine();
        System.out.println(sentence);
    }

    public void refill()
    {System.out.println("Refilling your pen");}
}

public class Practice
{
    public static void main(String[] args)
    {
        trimax t = new trimax();
        t.write();
        t.refill();
    }
}
