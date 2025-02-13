package Inheritance;

class Base
{
    int x;

    public int getX() {return x;}
    public void setX(int x)
    {
        System.out.println("Setting the value in base class");
        this.x = x;
    }

    public void printMe()
    {
        System.out.println("I am a constructor");
    }
}

class derived extends Base
{
    int y;

    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
}

public class inheritanceStart
{
    public static void main(String[] args)
    {
        System.out.println("Studying Inheritance");

        //creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //creating an object of derived class
        derived d = new derived();
        d.setX(69);
        System.out.println(d.getX());

    }
}