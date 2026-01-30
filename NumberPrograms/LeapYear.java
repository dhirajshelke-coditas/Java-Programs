package NumberPrograms;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int st=2000, end=2100;
    while(st<end) {
    	if((st%4==0) && (st%100!=0)||(st%400==0)) System.out.println(st);
     st++;
    }
	}

}
