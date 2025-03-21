import java.util.*;
import java.lang.*;
import java.io.*;

class Employee
{
    int id;
    String name;
    double salary;

    public Employee() { }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        // Adding 3 Employee objects
        list.add(new Employee(101, "uday", 50000));
        list.add(new Employee(102, "kiran", 60000));
        list.add(new Employee(103, "sivaji", 70000));

        // or take N number or employees as custom input
	// System.out.println("Enter how many employees you want");

        // int n = sc.nextInt();

        // for(int i = 0 ; i < n; i++){
        //     Employee emp = new Employee();
        //     System.out.println("Enter Employee id");
        //     emp.id = sc.nextInt();
        //     sc.nextLine();

        //     System.out.println("Enter Employee name");
        //     emp.name = sc.nextLine();

        //     System.out.println("Enter Employee salary");
        //     emp.salary = sc.nextDouble();
        //     sc.nextLine();

        //     list.add(emp);
        // }

        System.out.println("Employees Details are");
        for (Employee emp: list){
            emp.displayDetails();
        }
        sc.close();
    }

    public void displayDetails(){
        System.out.println(this.id + " " + this.name+ " " + this.salary);
    }
}
