//Solution to problem #1399B: Gifts Fixing from Codeforces Round #661 (Div. 3)

package unrated;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1399B {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cases = input.nextInt();
		ArrayList<Long> answers = new ArrayList<Long>();
		
		for (int test = 0; test < cases; test++) {
			int numGifts = input.nextInt();
			int[] candies = new int[numGifts];
			int[] oranges = new int[numGifts];
			for (int i = 0; i < numGifts; i++)
				candies[i] = input.nextInt();
			for (int i = 0; i < numGifts; i++)
				oranges[i] = input.nextInt();
			
			int candyTarget = candies[0];
			int orangeTarget = oranges[0];
			for (int i = 1; i < numGifts; i++) {
				if (candies[i] < candyTarget)
					candyTarget = candies[i];
				if (oranges[i] < orangeTarget)
					orangeTarget = oranges[i];
			}
			long moves = 0L;
			
			for (int i = 0; i < numGifts; i++) {
				if (candies[i] > candyTarget && oranges[i] > orangeTarget) {
					int candyDiff = candies[i]-candyTarget;
					int orangeDiff = oranges[i]-orangeTarget;
					if (candyDiff > orangeDiff) {
						candies[i] -= orangeDiff;
						oranges[i] -= orangeDiff;
						moves += orangeDiff;
					}
					else if (candyDiff < orangeDiff) {
						candies[i] -= candyDiff;
						oranges[i] -= candyDiff;
						moves += candyDiff;
					}
					else {
						candies[i] -= candyDiff;
						oranges[i] -= orangeDiff;
						moves += candyDiff;
					}
				}
			}
			
			for (int i = 0; i < numGifts; i++) {
				int difference;
				if (candies[i] > candyTarget) {
					difference = candies[i] - candyTarget;
					candies[i] -= difference;
					moves += difference;
				}
				if (oranges[i] > orangeTarget) {
					difference = oranges[i] - orangeTarget;
					oranges[i] -= difference;
					moves += difference;
				}
			}
			answers.add(moves);
		}
		for (long i : answers)
			System.out.println(i);
	}
}
