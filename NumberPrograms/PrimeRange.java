package NumberPrograms;

public class PrimeRange {

	public static boolean prime(int num) {
		boolean isPrime=true;
		for (int i = 2; i <=num/2; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for (int i = 3; i <=20; i++) {
		if(prime(i)) {
			System.out.println(i);
		}
	}
	}

}
