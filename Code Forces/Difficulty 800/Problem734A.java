//Solution to problem #734A: Anton and Danik on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem734A {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numGames = input.nextInt();
		String wins = input.next();
		int antonWins = 0, danikWins = 0;
		
		for (int i = 0; i < numGames; i++) {
			if (wins.substring(i, i+1).equals("A"))
				antonWins++;
			else
				danikWins++;
		}
		
		if (antonWins > danikWins)
			System.out.print("Anton");
		else if (antonWins < danikWins)
			System.out.print("Danik");
		else
			System.out.print("Friendship");
	}
}
