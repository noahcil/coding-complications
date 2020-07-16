//Solution to problem #339A: Helpful Maths on the Code Forces problem set

package difficulty800;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem339A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String sum = input.next();
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		//adding all the numbers in the inputted string to the ArrayList
		for (int i = 0; i < sum.length(); i+=2) {
			numbers.add(Integer.parseInt(sum.substring(i, i+1)));
		}

		//selection sort algorithm to sort values in the numbers ArrayList from least to greatest
		for (int i = 0; i < numbers.size(); i++) {
			int min = numbers.get(i);
			int minIndex = i;
			for (int j = i+1; j < numbers.size(); j++) {
				if (numbers.get(j) < min) {
					min = numbers.get(j);
					minIndex = j;
				}
			}
			if (min != numbers.get(i)) {
				int temp = numbers.get(i);
				numbers.set(i, numbers.get(minIndex));
				numbers.set(minIndex, temp);
			}
		}

		//prints output solution
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i));
			if (i != numbers.size()-1) {
				System.out.print("+");
			}
		}
	}
}
