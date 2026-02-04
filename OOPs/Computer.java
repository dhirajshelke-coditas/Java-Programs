package OOPs;

public class Computer {
    String brandCom;
    double priceCom;
    String processor;
    Pendrive p;
    public Computer() {
    	
    }

	public Computer(String brand, double price, String processor) {
		super();
		this.brandCom = brand;
		this.priceCom = price;
		this.processor = processor;
	}
	
	public void displayComputer() {
		System.out.println(brandCom);
		System.out.println(priceCom);
		System.out.println(processor);
	}
    
	public void insertPendrive(String brand, double price, int storage) {
		p = new Pendrive(brand, price, storage);
		System.out.println("Pendrive inserted");
	}
	
}
