package Interface;

/*
 *
 * Interface is a point where two system meet and interact.
 * In java interface is a group of related method with empty bodies.
 * An interface in Java is a blueprint for a class that contains only abstract methods (before Java 8)
 * and default/static methods (from Java 8 onward).
 * We can't extend multiple abstract classes, but we can implement multiple interfaces at a time.
 *
 * Abstract classes can have non-abstract methods that is concrete methods
 *
 * Interfaces have only abstract methods - that it means we have to implement it
 * Interface serves as a contract
 * */

interface Car
{
    //this interface is forcing other class which will be implementing this interface to apply this methods
    int speed = 60;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface extra
{
    int a = 45;
    void blowHorn();
    void headLights();
}

class bmw implements Car, extra
{
    //can be overwritten in class
    int speed = 120;
    int getSpeed()
    {return speed;}

    public void applyBrake(int decrement)
    {System.out.println("Speed is decrementing by factor "+decrement);}

    public void speedUp(int increment)
    {System.out.println("Speed is incrementing by factor "+increment);}

    public void blowHorn()
    {System.out.println("Blowing horn");}

    public void headLights()
    {System.out.println("Turning on the headlight");}
}

public class Interface1
{
    public static void main(String[] args)
    {
        bmw myCar = new bmw();
        System.out.println("The speed of car is: "+myCar.getSpeed());
        myCar.speedUp(60);
        myCar.applyBrake(10);
        //You can create properties in interface
        //You cannot modify the properties in interfaces as they are final
        //myCar.a = 69;

        myCar.blowHorn();
        myCar.headLights();
    }
}
