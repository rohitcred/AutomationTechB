package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30 };
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*****************");

		for (int var : arr) // For Each Loop 0r Enhanced for loop
		{
			System.out.println(var);
		}

	}

}
