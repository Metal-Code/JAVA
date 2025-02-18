package Access;
import java.util.Scanner;

class cylinder
{
    private int radius;
    private int height;

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    float sa()
    {
        return (float)((2 * 3.14 * radius * radius) + (2 * 3.14 * radius * height));
    }

    float volume()
    {
        return (float)(3.14 * radius *  radius * height);
    }

    cylinder()
    {
        this.radius = 5;
        this.height = 10;
    }

}

public class AccessPractice
{
    public static void main(String[] args)
    {
        cylinder c = new cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        int radius = sc.nextInt();
        c.setRadius(radius);

        System.out.println("Enter the height of the cylinder");
        int height = sc.nextInt();
        c.setHeight(height);

        float area = c.sa();
        float vol = c.volume();
        System.out.println("Radius and height of cylinder is "+c.getRadius()+" and "+c.getHeight());

        System.out.println("The surface area of the cylinder is: "+c.sa());
        System.out.println("The volume of the cylinder is: "+c.volume());
    }
}
