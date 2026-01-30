package NumberPrograms;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n1= 6, n2=8;
     int large= n1>n2?n1:n2;
     int i=1;
     
     while(true) {
    	 if((large%i)%n1==0 && (large*i)%n2==0) {
    		 System.out.println(large);
    		 break;
    	 }
    	 i++;
     }
	}


}
