package OOPs;

import java.util.Scanner;

 class SetPassword {
	 String username="Dhiraj_11";
	private String password;

	public String setPassword(String password) {
		this.password=password;
		System.out.println("Password updated");
		return password;
	}
	
	public void getPassword() {
		System.out.println(password);
	}
 }
 
 
 public class Encapsulation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SetPassword p1= new SetPassword();
      p1.setPassword("12345");
     p1.getPassword();

	}

}
