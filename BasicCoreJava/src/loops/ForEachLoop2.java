package loops;

public class ForEachLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "Rohit", "Anand", "Mohit" };

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("*****************");

		for (String var : arr) // For Each Loop 0r Enhanced for loop
		{
			System.out.println(var);
		}

	}

}
