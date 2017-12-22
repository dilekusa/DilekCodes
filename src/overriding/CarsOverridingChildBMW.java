package overriding;

import automobile.Cars;

public class CarsOverridingChildBMW extends Cars{
	// 1.Argument List=Argument list in the overriding method should be same as
	// the parent class overridden method
	// 2.Access modifier: Access modifier of the overriding method can not be
	// more restrictive than the overriden method
	// 3.private, static and final methods can not be overridden as they are
	int x=protectedSpeed*5;
	public static void main(String[] args) {
		// CarsOverridingChildBMW c1 = new CarsOverridingChildBMW();
		CarsOverridingChildBMW c2 = new CarsOverridingChildBMW();// assigning the
																// parent
																// reference to
																// child class
		c2.engineStart(2); // known as dynamic method call all together
		//c2.increaseSpeed();
		c2.
	}

	@Override
	public void engineStart(int cyl) {
		// super.engineStart(2);
		System.out.println("I am from the child class");
		protectedSpeed=5;
	}

	// as the method is static it is not overriden of parent class it is totally
	// different method
	public static void staticExample() {
		System.out.println("I am the static method from child");
	}
}
