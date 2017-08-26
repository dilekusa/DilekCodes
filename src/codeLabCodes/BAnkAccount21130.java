package codeLabCodes;

public class BAnkAccount21130 {
	// the existence of a BankAccount class with a method,
	// getAvailable that returns the amount of available funds
	// in the account (as an integer), and a subclass, OverdraftedAccount,
	// with two integer instance variables: overdraftLimit that represents the
	// amount of money the account holder can borrow from the account (i.e.,
	// the amount the account balance can go negative), and overdraftAmount,
	// the amount of money already borrowed against the account. Override the
	// getAvailable
	// method in OverdraftedAccount to return the amount of funds available (as
	// returned by
	// the getAvailable method of the BankAccount class) plus the overdraftLimit
	// minus
	// the overdraftAmount.
	int availableFunds;

	public int getAvailable() {
		return availableFunds;
	}
}
