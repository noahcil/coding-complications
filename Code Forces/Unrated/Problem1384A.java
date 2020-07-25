//Solution to problem #1384A: Common Prefixes from Codeforces Round #659 (Div. 2)

package unrated;

import java.util.Scanner;
import java.util.Random;

public class Problem1384A {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int testCases = input.nextInt();
		//declared but not initialized because these values change for every test case
		int numStrings;
		int[] commonPrefixLength;
		String[] strings;
		//r is going to be used to generate random strings
		Random r = new Random();

		//for loop that runs once for each test case
		for (int test = 0; test < testCases; test++) {
			//initializing previously declared variables for the current test case
			numStrings = input.nextInt();
			strings = new String[numStrings+1];
			commonPrefixLength = new int[numStrings];

			//this loop puts all of the prefix values into commonPrefixLength and finds the biggest common prefix length
			int maxPrefix = 0;
			for (int i = 0; i < numStrings; i++) {
				commonPrefixLength[i] = input.nextInt();
				if (commonPrefixLength[i] > maxPrefix)
					maxPrefix = commonPrefixLength[i];
			}

			//creates the first string in the strings[] array in order to derive the rest of the strings, with a length of maxPrefix+1
			String chars = "abcdefghijklmnopqrstuvwxyz";
			strings[0] = "";
			for (int i = 0; i < maxPrefix+1; i++) {
				//appends a random char from the String chars (lower case alphabet) to strings[0] (first string)
				strings[0] += chars.charAt(r.nextInt(chars.length()));
			}

			//creates the rest of the strings and puts them into the strings[] array
			for (int i = 0; i < numStrings; i++) {
				//use the length of the common prefix between string[i] and strings[i+1] to derive a String prefix from strings[i]
				String prefix = strings[i].substring(0, commonPrefixLength[i]);
				/*
				separator variable + while loop is used to prevent a scenario where the character right after the common prefix is generated the same for both strings
				Example: string1 = string, common prefix length for string1 and string2 is 5
				therefore the common prefix = strin, so we start making string2 by adding strin to it
				then a random char is generated to complete string2, but that random char happens to be 'g', making string2 = string as well. This creates a common index of 6 instead of the desired 5
				*/
				char separator = chars.charAt(r.nextInt(chars.length()));
				while (separator == strings[i].charAt(commonPrefixLength[i]))
					separator = chars.charAt(r.nextInt(chars.length()));
				//rest of the string after the prefix and separator
				String append = strings[i].substring(commonPrefixLength[i], strings[i].length()-1);
				//final string which conforms to problem constraints
				strings[i+1] = prefix + separator + append;
			}

			//prints out all of the strings in the strings[] array
			for (String string : strings) {
				System.out.println(string);
			}
		}
	}
}
