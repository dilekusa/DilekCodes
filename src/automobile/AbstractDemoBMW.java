package automobile;

public class AbstractDemoBMW extends AbstractCars {

	public void setPrivateSpeed(int speed) {
		super.setPrivateSpeed(speed);
	}

	// public void engineStart(){
	// //super.engineStart();
	// System.out.println("BMW s have keyless engine start");
	// }

	// abstraction want that method to be extend
	@Override
	public void engineStart(String keyType, int numOfCyl) {
		System.out.println("This is the BMW engine start");
	}

}

// public static void main(String[] args) {
// error beacuse abstract classes can not be
// AbstractCars c1 = new AbstractCars();

// }