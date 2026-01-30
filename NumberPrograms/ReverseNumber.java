package NumberPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int num=1234;
		   int rev=0;
		    while(num!=0) {
		    	int dig=num%10;
		    	rev=rev*10+dig;
		    	num/=10;
		    	
		    }
		    System.out.println(rev);
	}

}
