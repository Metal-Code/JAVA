package Methods;

public class VariableArguments
{
    static int sum(int x, int ...arr)
    {
        //available as int[]arr - that is it will club all the arguments passed to the function in an array

        //now we added a compulsory argument x

        int result = x;
        for (int a:arr)
        {
            result +=a;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(sum(1,2,3,4,5));
        //System.out.println(sum());
        //will throw error as it has no compulsory element

        System.out.println(sum(1,5));
        System.out.println(sum(1,2,4,5));
        System.out.println(sum(1,2,3));
    }
}
