package NumberPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=4;
     boolean isPrime=true;
     for (int i = 2; i <=num/2; i++) {
		if(num%i==0) {
			isPrime=false;
			break;
		}
	}
     if(isPrime) System.out.println("The number is Prime");
     else System.out.println("The number is not Prime");
   
	}

}
