package Interface;

/*
* We can extend an interface to another interface but not to a class
*
*/

interface sampleInterface
{
    void method1();
    void method2();
}

interface childSampleInterface extends sampleInterface
{
    void method3();
    void method4();
}

class mySampleClass implements childSampleInterface
{
    /*
    * unless method 1 and 2 is not implemented in this class it will throw an error, as method 1 and 2 are inherited
    * in interface childSampleInterface but only their methods are implemented
    * */

    public void method1()
    {
        System.out.println("This is method 1");
    }
    public void method2()
    {
        System.out.println("This is method 2");
    }
    public void method3()
    {
        System.out.println("This is method 3");
    }
    public void method4()
    {
        System.out.println("This is method 4");
    }
}

public class inheritanceInInterfaces
{
    public static void main(String[] args)
    {
        mySampleClass m = new mySampleClass();
        m.method1();
        m.method2();
        m.method3();
        m.method4();
    }
}
