package Inheritance;

/*
*
* Multiple inheritance face problems when there exist methods with same signature in both the super classes.
* Due to such problem java doesn't support multiple inheritance directly, but indirectly.
* A class can implement multiple interfaces and extend a class at the same time.
*
* Notes -
* 1. Interface in java is a bit like the class but with a significant difference.
* 2. An interface can only have method signatures, fields and default methods.
* 3. The class implementing an interface must define all the methods declared in the interface
*    (unless it’s an abstract class). However, interfaces cannot have regular instance variables—only
*    public static final constants.
* 4. You can create a reference of interfaces but not the object
* 5. Interface methods are public by default.
*
* */

public class WhyNotMultipleInheritance
{
    public static void main(String[] args)
    {

    }
}
