package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Alex", 1000.0);
		//Error 'cause Account has an "abstract" class
		Account acc2 = new SavingsAccount(1001, "Daniel", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1001, "Felipe", 1000.0, 500.0);

	}

}
