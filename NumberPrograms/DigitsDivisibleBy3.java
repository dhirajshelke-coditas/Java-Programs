package NumberPrograms;

public class DigitsDivisibleBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=6521635;
   while(num!=0) {
	   int dig=num%10;
	   if(dig%3==0) {
		   System.out.print(dig+", ");
	   }
	   num/=10;
   }
	}

}
