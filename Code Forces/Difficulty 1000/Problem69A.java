//Solution to problem #69A: Young Physicist on the Code Forces problem set

package difficulty1000;

import java.util.Scanner;

public class Problem69A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int vectors = input.nextInt();
		int xForce = 0, yForce = 0, zForce = 0;

		//adds inputs to respective force categories
		for (int i = 0; i < vectors; i++) {
			xForce += input.nextInt();
			yForce += input.nextInt();
			zForce += input.nextInt();
		}

		if (xForce == 0 && yForce == 0 && zForce == 0)
			System.out.print("YES");
		else
			System.out.print("NO");
	}

}
