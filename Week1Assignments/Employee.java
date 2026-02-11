package Week1Assignments;

public abstract class Employee {
     
	String name;
	int sal;
	public abstract void calculateSalary();
	
	public void displayDetails() {
	     System.out.println("Name: " + name);
	        System.out.println("Salary: " + sal);
	        System.out.println("----------------------");
	}
	public Employee(String name) {
		super();
		this.name = name;
	
	}
	
}
