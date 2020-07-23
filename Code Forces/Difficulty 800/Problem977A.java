//Solution to problem #977A: Wrong Subtraction on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem977A {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int number = input.nextInt();
		int subtractions = input.nextInt();
		
		for (int i = 0; i < subtractions; i++) {
			if (number % 10 != 0)
				number--;
			else
				number /= 10;
		}
		System.out.print(number);
	}
}
