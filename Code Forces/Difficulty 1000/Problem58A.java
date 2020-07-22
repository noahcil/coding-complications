//Solution to problem #58A: Chat Room on the Code Forces problem set

package difficulty1000;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem58A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String word = input.nextLine();
		ArrayList<String> hello = new ArrayList<String>(Arrays.asList("h", "e", "l", "l", "o"));

		int index = 0;
		int count = 0;
		//loop compares each letter in input to current letter in hello ArrayList, starting from the index of the last correct letter
		for (int i = 0; i < hello.size(); i++) {
			int temp = 0;
			for (int j = index; j < word.length(); j++ ) {
				if (hello.get(i).equals(word.substring(j, j+1))) {
					temp = j+1;
					count++;
					break;
				}
			}
			index = temp;
		}

		//if input had all 5 letters in the hello ArrayList (in order)
		if (count == 5)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}
