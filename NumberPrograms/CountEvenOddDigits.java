package NumberPrograms;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=123456789;
  int odd=0;
  int even=0;
    while(num!=0) {
      int dig=num%10;
      if(dig%2==0) {
      even++;
      }
      else {
    	  odd++;
      }
      num/=10;
    }
    System.out.println(even+" even numbers");
    System.out.println(odd+" odd numbers");
	}

}
