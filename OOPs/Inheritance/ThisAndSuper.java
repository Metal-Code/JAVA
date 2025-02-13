package Inheritance;

/*
* "this" is a way for us to reference an object of the class which is being created/referenced.
*
*
*
*
* super keyword variable is used to refer immediate parent class object
* 1. can be used to refer immediate parent class instance variable
* 2. can be used to invoke parent class methods
* 3. can be used to invoke parent class constructors
* */
class SomeClass
{
    int a;
    //getter
    public int getA()
    {
        return a;
    }
    //constructor like a setter
    SomeClass(int v)
    {
        this.a = v;
    }
    //method to return 1
    public int returnOne()
    {
        return 1;
    }
}

class anotherClass extends SomeClass
{
    anotherClass(int c)
    {
        /*
        *
        * there is no default constructor of class - "SomeClass"
        * so used the word super with parameter c, that is super(c)
        * to call that specific constructor of "SomeClass" otherwise it will throw an error
        *
        * */

        super(c);
        System.out.println("I am a constructor");
    }
}

public class ThisAndSuper
{
    public static void main(String[] args)
    {
        SomeClass s = new SomeClass(5);
        anotherClass an = new anotherClass(69);
        System.out.println(s.getA());
    }
}
