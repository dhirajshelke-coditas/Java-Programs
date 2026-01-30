package NumberPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
	int	n1=1, n2=2, n3=0;
    for (int i = 0; i <num; i++) {
		n3=n1+n2;
		System.out.println(n1);
	          n1=n2;
			  n2=n3;
    }
	}

}
