package automobile;

public class Cars {
	// No Modifier accessible
	public int speed;
	// only in class
	private int privateSpeed;
	// anywhere in Java with importing package and class
	public int publicSpeed;

	// in same package and in sub classes
	protected int protectedSpeed;

	int speedLimit = 100;

	public Cars() {
		this(0);
		System.out.println("I am from Cars class");
	}

	public void setPrivateSpeed(int pSpeed) {
		privateSpeed = pSpeed;
	}

	public Cars(int startSpeed) {
		this.privateSpeed = startSpeed;
		System.out.println("I am cONST- from Cars class");
	}

	public void increaseSpeed() {
		if (speed < 100) {
			speed++;
		}
		System.out.println("Increasing speed of Cars");
	}

	public void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing speed");
	}

}
