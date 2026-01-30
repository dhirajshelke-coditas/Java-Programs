package NumberPrograms;

import java.util.Iterator;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=15;
  System.out.println("Factors for 15 are: ");
     for (int i = 1; i <=15; i++) {
		if(num%i==0) System.out.println(i);
	}
	}

}
