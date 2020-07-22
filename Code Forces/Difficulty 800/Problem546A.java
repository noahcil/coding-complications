//Solution to problem #546A: Soldier and Bananas on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem546A {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int bananaCost = input.nextInt();
		int dollars = input.nextInt();
		int numBananas = input.nextInt();
		int moneyNeeded = 0;
		
		for (int i = 0; i < numBananas; i++) {
			moneyNeeded += (i+1) * bananaCost;
		}
		moneyNeeded -= dollars;
		
		if (moneyNeeded <= 0)
			System.out.print(0);
		else
			System.out.print(moneyNeeded);
	}
	
}
