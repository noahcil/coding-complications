//Solution to problem #1391B: Fix You from Codeforces Round #663 (Div. 2)

package unrated;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1391B {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cases = input.nextInt();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for (int test = 0; test < cases; test++) {
			int rows = input.nextInt();
			int columns = input.nextInt();
			char[][] conveyor = new char[rows][columns];
			for (int i = 0; i < rows; i++) {
				String temp = input.next();
				for (int j = 0; j < columns; j++) {
					conveyor[i][j] = temp.charAt(j);
				}
			}
			
			int moves = 0;
			for (int i = 0; i < columns-1; i++) {
				if (conveyor[rows-1][i] == 'D')
					moves++;
			}
			
			for (int i = 0; i < rows-1; i++) {
				if (conveyor[i][columns-1] == 'R')
					moves++;
			}
			ans.add(moves);
			
		}
		
		for (int i : ans)
			System.out.println(i);
	}
	
}