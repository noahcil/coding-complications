//Solution to problem #158A: Next Round on Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem158A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int participants = input.nextInt();
		//must subtract one to adjust for array index
		int cutoff = input.nextInt() -1;
		int advancing = 0;
		int[] scores = new int[participants];

		for (int i = 0; i < participants; i++) {
			scores[i] = input.nextInt();
		}
		//turning the value of cutoff from a place into a score
		cutoff = scores[cutoff];

		//score must be greater than 0 because 0 is not a positive value
		for (int i = 0; i < participants; i++) {
			if (scores[i] > 0 && scores[i] >= cutoff)
				advancing++;
		}
		System.out.print(advancing);
	}
}
