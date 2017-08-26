package exceptions;

import java.sql.SQLException;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		try {
			System.out.println("1st line");
			acc.withdraw(100);
			System.out.println("After trying the withdraw method");
		} catch (SQLException e) {

			// System.out.println(e.getMessage());
			System.out.println("Try agin at some other point");
		} finally {
			System.out.println("Always executes");
		}
	}
}
