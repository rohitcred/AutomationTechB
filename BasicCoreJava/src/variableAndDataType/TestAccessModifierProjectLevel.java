package variableAndDataType;

import functions.AccessModifiers;

public class TestAccessModifierProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers ref= new AccessModifiers();
		ref.publicfunction();
		//Protected member can be access through out the project using the child class
TestAccessModifierProjectLevel obj=new TestAccessModifierProjectLevel();
obj.protectedFunction();
	}

}
