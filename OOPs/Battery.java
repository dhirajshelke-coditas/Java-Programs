package OOPs;

public class Battery {
   
	String type;
	int mah;
	double price;
	
	public Battery() {
		
	}

	public Battery(String type, int mah, double price) {
		super();
		this.type = type;
		this.mah = mah;
		this.price = price;
	}
	
	public void displayBattery() {
		System.out.println(type);
		System.out.println(mah);
		System.out.println(price);
	}
}
