package OOPs;
import java.util.Scanner;

class square
{
    int side;
    int perimeter;
    int area;
    Scanner sc = new Scanner(System.in);

    public void setSide()
    {
        System.out.print("Enter the side of the square: ");
        side = sc.nextInt();
    }

    public void area()
    {
        System.out.println("The area of the square with side "+side+" is: "+(side*side));
    }

    public void perimeter()
    {
        System.out.println("The perimeter of the square with side "+side+" is: "+(4*side));
    }
}

public class CLassPractice2
{
    public static void main(String[] args)
    {
        square garden = new square();
        garden.setSide();
        garden.perimeter();
        garden.area();
    }
}
