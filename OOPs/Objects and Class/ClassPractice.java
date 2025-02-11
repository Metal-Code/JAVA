package OOPs;
import java.util.Scanner;

class worker
{
    String name;
    public void getName()
    {
        System.out.println("Your name is: "+name);
    }

    public void setName()
    {
        Scanner sc = new Scanner(System.in);
        String newName = sc.next();
        name = newName;
    }

    int salary;
    public int getSalary()
    {
        return (salary- (salary/10));
    }
}

public class ClassPractice
{
    public static void main(String[] args)
    {
        worker ayush = new worker();
        ayush.salary = 40000;
        ayush.name = "MetalBond";
        System.out.println("CTC of ayush is: "+ayush.salary);
        System.out.println("Inhand salary of ayush is: "+ayush.getSalary());
        System.out.println("Name of ayush is: "+ayush.name);
        System.out.println("Changing the name of ayush now: ");
        ayush.setName();
        System.out.println("New name of ayush is: "+ayush.name);

    }
}
