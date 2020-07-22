//Solution to problem #118A: String Task on the Code Forces problem set

package difficulty1000;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem118A {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String string = input.nextLine();
		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0; i < string.length(); i++) {
			array.add(string.substring(i, i+1));
		}
		
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).matches("a|e|i|o|u|y|A|E|I|O|U|Y")) {
				array.remove(i);
				i--;
			}
			else {
				if (Character.isUpperCase(array.get(i).charAt(0))) {
					array.set(i, array.get(i).toLowerCase());
				}
				array.add(i, ".");
				i++;
			}
		}
		
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i));
		}
	}
	
}
