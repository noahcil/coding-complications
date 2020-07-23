//Solution to problem #791A: Bear and Big Brother on the Code Forces problem set

package difficulty800;

import java.util.Scanner;

public class Problem791A {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int limaksWeight = input.nextInt();
		int bobsWeight = input.nextInt();
		int years = 0;
		
		while (limaksWeight <= bobsWeight) {
			limaksWeight *= 3;
			bobsWeight *= 2;
			years++;
		}
		System.out.print(years);	
	}
}
