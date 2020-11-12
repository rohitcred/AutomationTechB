package opps.polymorphism;

import opps.inheritance.Mobile;
import opps.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//You can use reference of your parent class for the object of your child class
		//In this scenario you can call only those functions which are present in your parent class
		//In this scenario your overridden methods will get call from your child class

		Telephone mobile=new Mobile();
		mobile.calling();
		//mobile.texting();
		

	}

}
