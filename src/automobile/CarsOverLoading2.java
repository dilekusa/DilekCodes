package automobile;

//diffrence in data type arguments
public class CarsOverLoading2 {

	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight("8");
	}

	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increased seat height by " + heightToIncrease + " inches. I am the integer one");
	}

	public static void increaseSeatHeight(String heightToIncrease) {
		System.out.println("Increased seat height by " + heightToIncrease + " inches. I am the string one.");
	}
}
