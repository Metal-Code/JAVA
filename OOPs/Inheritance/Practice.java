package Inheritance;
import java.util.Scanner;

class circle
{
    Scanner sc = new Scanner(System.in);

    private float radius;
    public float getRadius() {return radius;}
    public void setRadius(float radius) {this.radius = radius;}

    float getArea()
    {
       return (float) (3.14*radius*radius);
    }

}

class cylinder extends circle
{
    private int height;
    public int getHeight() {return height;}

    public void setHeight(int height) {this.height = height;}

    float surfaceArea;

    float cylinderVolume()
    {
        return (float) (height*getArea());
    }

}

public class Practice
{
    public static void main(String[] args)
    {
        System.out.println("Enter the radius of the object");
        circle c = new circle();
        cylinder cy = new cylinder();
        c.setRadius(5);
        cy.setRadius(4);
        cy.setHeight(4);
        System.out.println("The area of cicle is: "+c.getArea());
        System.out.println("The surface area of cylinder is: "+cy.cylinderVolume());
    }
}
