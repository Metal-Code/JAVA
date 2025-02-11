package OOPs;

//one java file can have on public class and if we don't specify anything the access modifier is default
//Object in OOPs = Attributes + methods

class Employee
{
    int id;
    String name;
    int salary;
    public void displayDetails()
    {
        System.out.println("My id is: "+id);
        System.out.println("MY gamer-name is: "+name);
    }

    public int getSalary()
    {
        return salary;
    }
}

public class CustomClass
{
    public static void main(String[] args)
    {
        // instantiating a new employee object
        Employee Ayush = new Employee();
        Employee Anshu = new Employee();
        //setting the attributes
        Ayush.id = 21;
        Ayush.name = "MetalBond";
        Ayush.salary = 40000;
        Anshu.id = 69;
        Anshu.name = "HEheEH";
        //System.out.println(Ayush.id);
        //System.out.println(Ayush.name);

        Ayush.displayDetails();
        System.out.println(Ayush.getSalary());
        Anshu.displayDetails();

    }
}
