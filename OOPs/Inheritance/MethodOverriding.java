package Inheritance;

class firstClass
{
    //method 1
    public int method1()
    {
        return 69;
    }

    //method 2
    public void method2()
    {
        System.out.println("I am a method 2 of class \"firstCLass\" ");
    }
}

class secondClass extends firstClass
{
    /*
    *
    * method2() of secondClass overrides the method2() of firstClass
    *
    * secondClass has inherited all the methods of the firstClass, so making the method2 overridden from firstClass
    * it tells it to run that same function differently exclusively for the secondClass
    *
    * it automatically overrides the method,
    * but it is a good recommended to use - @Override keyword
    * to avoid any confusions
    *
    * */
    @Override
    public void method2()
    {
        System.out.println("I am a method 2 of class \"secondCLass\" ");
    }

    public void method3()
    {
        System.out.println("I am a method 1 of class \"secondClass\" ");
    }
}

public class MethodOverriding
{
    public static void main(String[] args)
    {
        firstClass a = new firstClass();
        a.method2();

        secondClass b = new secondClass();
        b.method2();
    }
}
