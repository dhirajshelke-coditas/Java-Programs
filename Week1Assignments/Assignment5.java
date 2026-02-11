package Week1Assignments;

public class Assignment5 {

	int add;
	
	public static void add1(int add) {
		add++;
		System.out.println(add);
	}
	
	void add2(Assignment5 a) {
		add++;
		System.out.println(add);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int add=12;
       System.out.println(add);
       System.out.println("--------------------------------");
       add1(add);
       System.out.println(add);
       Assignment5 a1= new Assignment5();
       a1.add2(a1);
     //  a1.add2(a1);
       System.out.println(add);
       
	}

}
