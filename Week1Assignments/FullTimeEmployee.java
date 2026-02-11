package Week1Assignments;

public class FullTimeEmployee extends Employee {

     int perDaySal,days;

	 public FullTimeEmployee(String name, int perDaySal, int days) {
		super(name);
		this.perDaySal = perDaySal;
		this.days = days;
	 }
     
	 @Override
	 public void calculateSalary() {
		// TODO Auto-generated method stub
		 sal=perDaySal*days;

	 }
     
     
	
	

}
