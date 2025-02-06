import java.util.Scanner;

class EmployeeException extends Exception 
{
    public EmployeeException(String message) 
    {
        super(message);
    }
}

class Employee 
{
    private int employeeID;
    private String name;
    private int age;
    private double income;
    private String city;
    private String vehicle;

    // Constructor to initialize the values
    public Employee(int employeeID, String name, int age, double income, String city, String vehicle) 
    {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.income = income;
        this.city = city;
        this.vehicle = vehicle;
    }

    // Method to accept values from user
    public static Employee acceptDetails() throws EmployeeException 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();
        sc.nextLine(); // Consume the newline

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter Vehicle: ");
        String vehicle = sc.nextLine();

        // Checking the conditions
        if (age < 18 || age > 55) 
        {
            sc.close();  // Close the scanner before throwing exception
            throw new EmployeeException("Age should be between 18 and 55.");
        }

        if (income < 50000 || income > 100000) 
        {
            sc.close();  // Close the scanner before throwing exception
            throw new EmployeeException("Income should be between Rs. 50,000 and Rs. 1,00,000.");
        }

        if (!(city.equalsIgnoreCase("Pune") || city.equalsIgnoreCase("Mumbai") ||
              city.equalsIgnoreCase("Bangalore") || city.equalsIgnoreCase("Chennai"))) 
            {
                sc.close();  // Close the scanner before throwing exception
                throw new EmployeeException("Employee must be staying in Pune, Mumbai, Bangalore, or Chennai.");
            }

        if (vehicle == null || vehicle.isEmpty() || !vehicle.toLowerCase().contains("four")) 
        {
            sc.close();  // Close the scanner before throwing exception
            throw new EmployeeException("Employee must have a 4-wheeler vehicle.");
        }

        // If all conditions are met, return the Employee object
        sc.close();  // Close the scanner before returning
        return new Employee(id, name, age, income, city, vehicle);
    }

    // Method to display Employee details
    public void displayDetails() 
    {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Income: Rs. " + income);
        System.out.println("City: " + city);
        System.out.println("Vehicle: " + vehicle);
    }

    public static void main(String[] args) 
    {
        try 
        {
            // Accepting Employee details
            Employee employee = Employee.acceptDetails();

            // Displaying the employee details
            employee.displayDetails();
        } 
        catch (EmployeeException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
