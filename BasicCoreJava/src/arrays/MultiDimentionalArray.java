package arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data = new String[3][2];

		// Row1
		data[0][0] = "User1";
		data[0][1] = "Password1";

		// Row 2

		data[1][0] = "User2";
		data[1][1] = "Password2";

		// Row 3

		data[2][0] = "User3";
		data[2][1] = "Password3";

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 2; c++) {
				System.out.println(data[r][c]);
			}

		}

	}

}
