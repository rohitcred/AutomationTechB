package constructor;

//not static variable defined at class level are known as instance variable

public class Car {
	String Colour;
	String model;
	int engine;
	// Default value of string variable will always be null
	// for integer its zero (0)

	// static variable defined at class level are know as class variable

	static int wheels;

	public void features() {
		// variable defined in a functions are known as local variable
		int a = 10;

		System.out.println("Car features colour:" + Colour + ", model:" + model + " and engine size:" + engine
				+ ", wheels=" + wheels);

	}
	//Constructor initializes the object
	public Car()
	{
		
	}
	// Parametarized Constructor
	public Car (String Col, String mod, int eng)
	{
		Colour=Col;
		model=mod;
		engine=eng;
	}
	// Constructor Overloading: 2 or more constructor with diff parameter
}
