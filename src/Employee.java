public class Employee {
	String firstName;
	String lastName;
	int age;
	
	public void employeeDetails() {
		System.out.println("First name:"+ firstName + "\n" + "Last name:" + lastName +"\n"+ "Age" + age);
	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.firstName = "Shruthi";
		employee1.lastName = "Kulkarni";
		employee1.age = 20;
		
		employee1.employeeDetails();
		
		Employee employee2 = new Employee();
		employee2.firstName = "kruthi";
		employee2.lastName = "Kulkarni";
		employee2.age = 22;
		
		employee2.employeeDetails();
	}
}
