  package Week2Assignments.assignment7;

public class Assignment7 {

	    public enum Status {
	        //PLACED - SHIPPED - DELIVERED - CANCELLED
	        PLACED("Status Updated"),
	        SHIPPED("It is in process"),
	        DELIVERED("Order got delivered"),
	        CANCELLED("Order is Cancelled");

	         String s;

	        Status(String s){
	            this.s = s;
	        }
	        
	        public String toString(){
	           return  s;
	        }
	    }

	    public static class Order {
	        String orderName;
	        int orderId;
	       

	        public static void main(String[] args) {
	            Status placed = Status.PLACED;
	            Status shipped = Status.SHIPPED;
	            Status delivered = Status.DELIVERED;
	            Status cancelled = Status.CANCELLED;
	            System.out.println(placed);
	            System.out.println(shipped);
	            System.out.println(delivered);
	            System.out.println(cancelled);

	          
	            
	        }
	    }
	}

