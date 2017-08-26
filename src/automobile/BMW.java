package automobile;

public class BMW extends Cars {

	public BMW(int startSpeed) {
		super(startSpeed);
		System.out.println("I am CONSTRUCTOR from BMW class, ou give me  " + startSpeed);
	}
	// public void increaseSpeed(int speed){
	//
	// }

	@Override
	public void increaseSpeed() {
		protectedSpeed++;
		System.out.println("I am from BMW override increaseSpeed");
	}

	// Cars c1 = new Cars();
	// c1.decreaseSpeed();
	// System.out.println("Increasing Speed of BMW");

	// }

	public void headupDisplayNavigation() {
		System.out.println("BMW specific functionality");
	}

}
