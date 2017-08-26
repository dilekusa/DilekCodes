package inheritence;

public class Arithmetic {
	/*
	 * Create a class named Arithmetic with 1-a method named "add" that takes
	 * integers as parameters and returns an integer denoting their sum. 2-a
	 * method named "multiple" that takes integers as parameters and returns an
	 * integer denoting their multiplication. A class named AdderMultiply that
	 * inherits from a superclass named Arithmetic.
	 * 
	 * also create a main method and invoke new object from AdderMultiply class
	 * and invoke methods.
	 */

	public int add(int x, int y) {
		return x + y;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
}
