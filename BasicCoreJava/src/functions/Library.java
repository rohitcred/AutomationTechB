package functions;

public class Library {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void print() {
		System.out.println("Testing static Function");
	}

	public void fun1() {
		System.out.println("Testing non static Function");
	}
	public String printName (String name)
	{
		return "Your name is "+name;
	}
}
