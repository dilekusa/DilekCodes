package stringMethods;

import java.util.Scanner;

public class BasicString {

	public static void main(String[] args) {
		/*
		 * Given two strings of lowercase English letters, and , perform the
		 * following operations: 1)Sum the lengths of A and B
			2)Determine if is
		 * lexicographically larger than (i.e.: does come before in the
		 * dictionary?). 
		 * 3)Capitalize the first letter in and and print them on
		 * a single line, separated by a space. Input Format---uSE SCANNER The
		 * first line contains a string . The second line contains another
		 * string .
			*The strings are comprised of only lowercase English letters.
		 * Output Format
		 *  There are three lines of output: 
		 *  1)For the first line,
		 * sum the lengths of A and B 2)For the second line, write Yes if is
		 * lexicographically larger than or No if it is not. 3)For the third
		 * line, capitalize the first letter in both and and print them on a
		 * single line, separated by a space.
		 * 
		 * Sample Input hello java Sample Output 9 No Hello Java
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string A");
		String A = scan.next();
		System.out.println("Enter second string B");
		String B = scan.next();
		scan.close();
		System.out.println(A.length() + B.length());
		// for comparing the strings we can use compare to if A comes after B
		// then A.compareTo(B)>0
		if (A.compareTo(B) > 0) {
			System.out.println(A + " comes after " + B + " in dictionary");
		} else {
			System.out.println(B + " comes after " + A + " in dictionary");
		}
		// or we can do this only one step
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

		String firstLetterA = A.substring(0, 1).toUpperCase();// change only
																// first letter
																// to uppercase
		String otherLettersA = A.substring(1);
		String firstLetterB = B.substring(0, 1).toUpperCase();
		String otherLettersB = B.substring(1);

		System.out.println(firstLetterA + otherLettersA + " " + firstLetterB + otherLettersB);
	}

}

/*
 * if needed Explanation
 * 
 * String is "hello" and is "java".
 * 
 * A has a length of , and has a length of ; the sum of their lengths is 9 When
 * sorted alphabetically/lexicographically, "hello" comes before "java";
 * therefore, A is not larger than B and the answer is No.
 * 
 * When you capitalize the first letter of both and and then print them
 * separated by a space, you get "Hello Java".
 */