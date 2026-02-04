package OOPs;

public class Mobile {

	 String model;
	 double priceMob;
	 int ram;
	 int rom;
	 Battery b1;
	 
	 public Mobile(){
		 
	 }

	 public Mobile(String model, double priceMob, int ram, int rom, String type, int mah, double price) {
		super();
		this.model = model;
		this.priceMob = priceMob;
		this.ram = ram;
		this.rom = rom;
		b1= new Battery(type, mah, price);
	 }
	 
	 public void displayMobile() {
		 System.out.println(model);
		 System.out.println(priceMob);
		 System.out.println(ram);
		 System.out.println(rom);
	 }
	 public void displayMobBat() {
		 System.out.println(model);
		 System.out.println(priceMob);
		 System.out.println(ram);
		 System.out.println(rom);
			System.out.println(b1.type);
			System.out.println(b1.mah);
			System.out.println(b1.price);
	 }

}
