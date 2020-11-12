package opps.abstraction;

//1. You can't have abstract methods inside a concrete class
//2. Abstract class:Classes which have abstract keyword in their signature & can't be instantiated
//3. Concrete class:Classes which don't have abstract keyword in their signature & can be instantiate

public abstract class MSWord {
	
	public abstract void save();
	
	/*{
		Body
	}*/
	
	public abstract void insert();
	public abstract void table();
	public abstract void share();
	public abstract void convert();
	public abstract void font();

}
