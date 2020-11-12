package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void publicfunction() {
		System.out.println("Public function");
	}

	private void PrivateFunction() {
		System.out.println("Private function");
	}

	void noAccessModifier() {
		System.out.println("No Access Modifier");
	}
//Protected member can be access through out the project using the child class
	protected void protectedFunction() {
		System.out.println("Protected Function");
	}

}
