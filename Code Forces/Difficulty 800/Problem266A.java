//Solution to problem #266A: Stones on the Table on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem266A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n = input.nextInt();
		String s = input.next();
		int answer = 0;

		//checks if current rock is the same as the previous rock
		char last = s.charAt(0);
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == last)
				answer++;
			last = s.charAt(i);
		}

		System.out.print(answer);
	}
}
