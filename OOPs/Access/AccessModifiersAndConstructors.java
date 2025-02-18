package Access;

/*
*
* Access modifiers - Specifies where a property/method is accessible
* Four types of access modifiers in java:
* 1. Private - a private access modifier means that the attribute (or method) can only be
*              accessed or modified within the same class. It cannot be directly
*              accessed or modified from outside the class.
* 2. Public
* 3. Protected
* 4. Default
*
* */

class MyEmployee
{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setId(int i)
    {
        id = i;
    }

    public int getId()
    {
        return id;
    }

}

public class AccessModifiersAndConstructors
{
    public static void main(String[] args)
    {
        MyEmployee ayush = new MyEmployee();
        //ayush.id = 21;
        //ayush.name = "MetalBond";
        //will throw error due to private access modifier

        ayush.setName("Metalbond");
        ayush.setId(21);
        System.out.println(ayush.getName());
        System.out.println(ayush.getId());


    }
}
