package opps.abstraction;

public class BankUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI bank1 = new Kotak();

		bank1.creditCard();
		bank1.savingAccount();
		bank1.currentAccount();
		bank1.debitCard();

		System.out.println("********************");
		
		bank1.creditCard();
		bank1.savingAccount();
		bank1.currentAccount();
		bank1.debitCard();

		System.out.println("********************");
		
   		bank1.creditCard();
		bank1.savingAccount();
		bank1.currentAccount();
		bank1.debitCard();

	}

}
