package Week3Assignments.Assignment3;

public class Threads extends Thread
{
	 int progress=0;
	static int endPoint=10;
	static boolean isWon=false;
	
	public Threads(String name) {
		super(name);
	}
	@Override
	public void run() {
		
		while(!isWon && progress<endPoint ) {
			progress++;
			
			System.out.println(getName()+" : "+progress);
	
		}
			if(!isWon) {
				isWon=true;
				System.out.println(getName()+" "+"has won the race");
			}
		}
		
	
}