package OOPs;


   
   public class Pendrive {

	    String brand;
	    double price;
	    int storage;

	    public Pendrive() {
	    }

	    public Pendrive(String brand, double price, int storage) {
	        this.brand = brand;
	        this.price = price;
	        this.storage = storage;
	    }
	    
	    public void displayPendrive() {
	    	System.out.println(brand);
	    	System.out.println(price);
	    	System.out.println(storage);
	    }
	}

