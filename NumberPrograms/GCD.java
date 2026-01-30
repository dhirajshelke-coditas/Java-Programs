package NumberPrograms;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=21, n2=28;
		int small=n1<n2?n1:n2;
		while(true) {
			if((n1%small==0)&& (n2%small==0)) {
				System.out.println(small);;
				break;
			}
			small--;
		}
	}

}
  