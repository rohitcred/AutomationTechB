package arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= new String[3];
		
		arr[0]="Rohit";
		arr[1]="Mohit";
		arr[2]="Anand";
		
		System.out.println(arr.length);
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
