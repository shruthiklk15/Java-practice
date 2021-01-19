import java.util.Scanner;
class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name;
        int age;
        double salary;

        System.out.println("Enter Employee Name");
        name = scn.next();

        System.out.println("Enter Employee age");
        age = scn.nextInt();

        System.out.println("Enter Employee salary");
        salary = scn.nextDouble();

        System.out.println("-----------------");


        System.out.println("Name of the employee is "+name);
        System.out.println("age of the employee is "+age);
        System.out.println("salary of the employee is "+salary);



        
    }
}