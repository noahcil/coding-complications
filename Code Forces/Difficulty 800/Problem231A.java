//Solution to problem #231A: Team on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem231A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n = input.nextInt();
		int implement = 0;

		//loop goes through each set of 3 solution values
		for (int i = 0; i < n; i++) {
			int count = 0;
			//loop checks the if each of the 3 values in a solution set is 1 or not
			for (int j = 0; j < 3; j++) {
				if (input.nextInt() == 1)
					count++;
			}
			if (count >= 2)
				implement++;
		}

		System.out.print(implement);
	}
}
