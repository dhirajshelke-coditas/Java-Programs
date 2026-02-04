package OOPs;

 class Driver1 {
     
   public void topper() {
	   System.out.println("Iam Driver 1");
   }
	
	
}

class Driver2 extends Driver1{
	public void silent() {
		   System.out.println("Iam Driver 2");

	}
	
	
}
 public class UpCastingAndDowncasting{
	 public static void main(String[] args) {
		Driver2 d1= new Driver2(); 
//		d1.topper();
//		d1.silent();
		
		Driver1 d2= new Driver2();
		d2.topper();
		
		Driver2 d3= (Driver2) d2;
		d3.silent();
	}
 }
