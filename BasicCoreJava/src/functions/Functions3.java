package functions;

public class Functions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// IIT JEE>=40, CET>=60
		// You are eligible
		// you are not eligible

		boolean ret = eligibility(30, 50);
		if (ret) {
			System.out.println("you are eligible");
		} else {
			System.out.println("you are not eligible");
		}
		// eligibility(41, 72);

		int a = sum(10, 20);
		System.out.println(a);
		int b = sum(30, 40);
		System.out.println(b);

		int c = sum(a, b);
		System.out.println(c);

	}

	public static boolean eligibility(int iit, int cet) {

		if (iit >= 40 || cet >= 60) {
			return true;
		} else {
			return false;
		}

	}

	// public static void sum(int a, int b) {
	// System.out.println(a + b);

	public static int sum(int a, int b) {
		return a + b;
	}
}
