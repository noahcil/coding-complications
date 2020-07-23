//Solution to problem #160A: Twins on the Code Forces problem set

package difficulty900;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Problem160A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numCoins = input.nextInt();
		//This array must be initialized with the object form of int in order to use the Collections.reverseOrder() command)
		Integer[] coins = new Integer[numCoins];
		int value = 0;
		for (int i = 0; i < numCoins; i++) {
			coins[i] = input.nextInt();
			value += coins[i];
		}
		//Coins sorted from greatest to least value in order to add most expensive coins first
		Arrays.sort(coins, Collections.reverseOrder());

		int myCoins = 0;
		int myVal = 0;
		while (myVal <= value/2) {
			//using myCoins as the index here works because it is guaranteed to increase by one until the above condition is met
			myVal += coins[myCoins];
			myCoins++;
		}
		System.out.print(myCoins);
	}
}
