package NumberPrograms;

public class SearchTheDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=12345;
    int search=42;
    boolean isPresent=false;
    while(num!=0) {
    	if(num%10==search) {
    		isPresent=true;
    	break;
    	}
    
    	num/=10;
    }
    if(isPresent) System.out.println("The number is present");
    else System.out.println("The number is not present");
	}

}
