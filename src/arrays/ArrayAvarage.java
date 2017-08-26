package arrays;

public class ArrayAvarage {

	public static void main(String[] args) {
		/*
		 * Create an array temps of doubles(76.3,70.5,68.4,83,4),this array
		 * containing temperature data, to compute the average temperature.
		 * Store the average in a variable called avgTemp. Besides temps and
		 * avgTemp, you may use only two other variables -- an int variable k
		 * and a double variable named total.Print the avgTemp at the end;if you
		 * want you can get the temps from scanner
		 */
		double avgTemp;
		double[] temps = { 76.3, 70.5, 68.4, 83, 4 };
		double total = 0;
		

		for (int k = 0; k < temps.length; k++) {
			total = total + temps[k];
		}
		avgTemp = total / temps.length;
		System.out.println("Average temp is: " + avgTemp);
		
	
	}
}
// we can do this with for each loop which is special for arrays
// for (double d : temps) {
// System.out.println(d + "F");
// total = d + total;
// }
// avgTemp = total / temps.length;
// System.out.println("Average temp is for each loop: " + avgTemp + "F");
// }}
