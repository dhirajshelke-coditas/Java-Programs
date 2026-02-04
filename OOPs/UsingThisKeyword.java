package OOPs;


class Demo1{
	String name;
	int age;
	String loc;
	
	public Demo1() {
		// TODO Auto-generated constructor stub
	}


public Demo1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Contructor 1 executed");
	}
public Demo1(String loc) {
	this();
	this.loc=loc;
	System.out.println("Contructor 2 executed");

}
  public void display() {
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(loc);
  }

}


public class UsingThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Demo1 d1= new Demo1("Dhiraj", 23);
       d1.display();
       System.out.println();
       Demo1 d2= new Demo1("Pune");
      d2.display();
       
       
	}

}
