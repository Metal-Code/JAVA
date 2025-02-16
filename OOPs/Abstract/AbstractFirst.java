package Abstract;

/*
* Abstract - existing in thought or as an idea without concrete existence
* Abstract Method - a method that is declared without an implementation
*
* If a class includes abstract methods, then the class itself must be declared abstract
*
* Abstract class and methods are only meant to be inherited. It serves as a template for other class to adopt.
* Abstract class and methods are used to create another abstract class or a concrete class.
* Until all abstract methods in a class hierarchy are implemented, no concrete class can be instantiated.
* Until concrete class is not created, no object can be instantiated.
* You cannot create an object of abstract class.
*
*
*
* */

abstract class parent
{
    public parent()
    {
        System.out.println("I am a constructor of class base");
    }

    public void sayHello()
    {
        System.out.println("Hello nigga");
    }

    abstract public void greet();
}

class child extends parent
{
    @Override
    public void greet()
    {
        System.out.println("Saying hello nigga in class child");
    }
}

class child1 extends parent
{
    public void greet()
    {
        System.out.println("Saying hello nigga in class child1");
    }
}

public class AbstractFirst
{
    public static void main(String[] args)
    {
        System.out.println("Learning abstract class and methods");
        child1 c = new child1();
    }
}
