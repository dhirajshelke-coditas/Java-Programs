package NumberPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=1231;
   int rev=0;
   int copy=num;
   
    while(num!=0) {
    	int dig=num%10;
   rev=rev*10+dig; 
   num/=10;
    }
    if(rev==copy) System.out.println("The number is palindrome");
    else System.out.println("The number not is palindrome");
	}

}
