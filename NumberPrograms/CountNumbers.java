package NumberPrograms;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=11010101;
   int count=0;
   while(num!=0) {
	   count++;
	   num/=10;
   }
   System.out.println(count);
	}

}
