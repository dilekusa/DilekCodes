package automobile;

//sequence of data type of argument list
public class CarsOverloading3 {

	public static void main(String[] args) {
		increaseSeatHeight("2", 2);
		increaseSeatHeight(8, "8");

	}

	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("I am the first overload");
	}

	public static void increaseSeatHeight(int variable2, String variable1) {
		System.out.println("I am the second overload");
	}

}
