package Week1Assignments;

public class PartTimeEmployee extends Employee {
	
	int perDaySal,days;

    public PartTimeEmployee(String name, int perDaySal, int days) {
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
