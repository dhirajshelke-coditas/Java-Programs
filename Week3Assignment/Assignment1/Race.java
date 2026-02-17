package Week3Assignments.Assignment3;

public class Race {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
        Threads car1 = new Threads("Car 1");
        Threads car2 = new Threads("Car 2");
        Threads car3 = new Threads("Car 3");
		
		
		car1.start();
		car2.start();
		car3.start();
	


	
   
	}
	

}
