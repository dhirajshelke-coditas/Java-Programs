package Week1Assignments;

public class BankAccount {
      static private int balance;
      class Transaction{
    	  public void withdrawMoney(int amt) {
    		  balance-=amt;
    	  }
    	  public void depositMoney(int amt) {
    		  balance+=amt;
    	  }
    	  public void displayBalance() {
    		  System.out.println("Current Balance: "+balance);
    	  }
      }
}
