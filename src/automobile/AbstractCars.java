package automobile;

public abstract class AbstractCars {

	private int privateSpeed;
	public int publicSpeed;

	protected int protectedSpeed;

	int speedLimit = 100;

	public AbstractCars() {
		this(0);
		System.out.println("I am from AbstractCars class");
	}

	public AbstractCars(int startSpeed) {
		this.privateSpeed = startSpeed;
		System.out.println("I am cONST- from AbstractCars class");
	}

	public void setPrivateSpeed(int pSpeed) {
		privateSpeed = pSpeed;
	}

	// public abstract void engineStart()
	// {
	// System.out.println("Engine starts");
	// the body should be gone
	// }
	public abstract void engineStart(String keyType, int numOfCyl);

}
