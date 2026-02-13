package Week2Assignments.assignment3;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   FullTimeEmployee e1= new FullTimeEmployee("Dhiraj", 1000, 25);
   e1.calculateSalary();
   e1.displayDetails();
   FullTimeEmployee e2= new FullTimeEmployee("Gaurav", 1020, 20);
   e2.calculateSalary();
   e2.displayDetails();
   
   PartTimeEmployee p1= new PartTimeEmployee("Kashish", 100, 10);
   p1.calculateSalary();
   p1.displayDetails();
	}

}
