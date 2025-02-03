package Methods;

public class MethodOverloading
{
    static void tellJoke()
    {
        System.out.println("HEHEHEHEHE");
    }

    static void change(int a)
    {
        a = 98;
    }

    static void changeArray(int []arr)
    {
        arr[0] = 69;
    }

    static void printa()
    {
        System.out.println("Printing without parameters");
    }
    static void printa(int a)
    {
        System.out.println("Printing with 1 parameter");
    }
    static void printa(int a,int b)
    {
        System.out.println("Printing with 2 parameters");
    }
    //values inside the function definition is called as parameters



    public static void main(String[] args)
    {
//        tellJoke();

        //changing the value of an integer  - pass by value
//        int x = 45;
//        change(x);
//        System.out.println(x);

        //changing the value inside an array
        int []marks = {1,2,3,4,5,6,7};
        changeArray(marks);
//        System.out.println("After going through the changeArray method marks[0] is: "+marks[0]);

        printa();
        printa(5);
        printa(6,7);
        //when function is called the numbers or parameters inside it are called as arguments
        /*
        * this is called method overloading
        * it finds the suitable function
        * */
    }
}
