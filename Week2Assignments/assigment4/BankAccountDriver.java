package Week2Assignments.assigment4;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1= new BankAccount();
         BankAccount.Transaction t1= b1.new Transaction();
       
         t1.depositMoney(20000);
         t1.displayBalance();
         t1.withdrawMoney(200);
         t1.displayBalance();
         
	}

}
