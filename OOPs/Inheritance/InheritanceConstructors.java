package Inheritance;

class Base1
{
    Base1()
    {
        System.out.println("I am a constructor of base class without parameters");
    }

    Base1(int a)
    {
        System.out.println("I am an overloaded constructor with parameters that is a: "+a);
    }

    public int x;

    public int getX() {return x;}

    public void setX(int x) {this.x = x;}
}

class Derived1 extends Base1
{
    Derived1()
    {
        System.out.println("I am a constructor of derived class");
    }

    Derived1(int m, int n)
    {
        System.out.println("I am derived class constructor with 2 parameters"+m+" and "+n);
    }

    int y;
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
}

class childOfDerived extends Derived1
{
    childOfDerived()
    {
        System.out.println("I am an overloaded constructor of derived with value of y as: "+y);
    }

    childOfDerived(int o, int q)
    {
        System.out.println("I am a constructor with 2 arguments");
    }
}

public class InheritanceConstructors
{
    public static void main(String[] args)
    {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();

        Derived1 d = new Derived1(2,3);
        childOfDerived cd = new childOfDerived();

        /*
        * when you create a constructor of derived class it first implicitly calls the constructor of base class
        * then its own that is derived class
        *
        * super(m,n) -> calls the constructor from parent class which takes 2 variables
        * so it chooses the constructor we want
        *
        * */


    }
}
