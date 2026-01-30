package NumberPrograms;

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=11;
  boolean flag=false;
    while(num!=0) {
    	if(num%10==0) {
    		flag=true;
    		break;
    		}
    	num/=10;
    }
    if(flag==true) System.out.println("The number is a duck number");
    else System.out.println("The number is not a duck number");
	}

}
