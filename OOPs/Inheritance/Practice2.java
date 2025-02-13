package Inheritance;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

class rectangle
{
    public int length;
    public int breadth;
    rectangle(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }
    public int getArea()
    {
        return (length*breadth);
    }
}

class cuboid extends rectangle
{
    public int height;
    cuboid(int l, int b, int h)
    {
        super(l,b);
        this.height = h;
    }
    public int getVolume()
    {
        return length*breadth*height;
    }
}

public class Practice2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l,b,h;
        System.out.println("Enter the length");
        l = sc.nextInt();
        System.out.println("Enter the breadth");
        b = sc.nextInt();
        System.out.println("Enter the height");
        h = sc.nextInt();
        rectangle r = new rectangle(l,b);
        cuboid c = new cuboid(l,b,h);
        System.out.println("The area of the rectangle is: "+r.getArea());
        System.out.println("The volume of the cuboid is: "+c.getVolume());
        sc.close();
    }
}
