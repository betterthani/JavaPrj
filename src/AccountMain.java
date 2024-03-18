
public class AccountMain {

	public static void main(String[] args) {
		Account myAccount = new Account();
		
		myAccount.name = "홍길동";
		myAccount.accountNumber = "002-122-011420";
		myAccount.passwd = "1234";
		myAccount.balance = 3800000;
		myAccount.interest = 6.03F;
		
		myAccount.saveMoney(50000);
		myAccount.withdrawMoney(80000);
		long myBalance = myAccount.getBalance();
		System.out.println(myBalance);
				
	}

}
