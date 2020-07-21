//Solution to problem #158B: Taxi on the Code Forces problem set
//This code is dumb and stupid, and I'm too lazy to explain. pls use someone elses solution :)

package difficulty1100;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem158B {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n = input.nextInt();
		ArrayList<Integer> ones = new ArrayList<Integer>();
		ArrayList<Integer> twos = new ArrayList<Integer>();
		ArrayList<Integer> threes = new ArrayList<Integer>();
		int passengers = 0, cars = 0;

		for (int i = 0; i < n; i++) {
			int temp = input.nextInt();
			if (temp == 4)
				cars++;
			else if (temp == 3)
				threes.add(temp);
			else if (temp == 2)
				twos.add(temp);
			else
				ones.add(temp);
		}

		if (twos.size() % 2 == 0)
			cars += twos.size() / 2;
		else {
			cars += (twos.size()-1) / 2;
			passengers = 2;
		}

		if (ones.size() > threes.size()) {
			while (threes.size() > 0) {
				threes.remove(0);
				ones.remove(0);
				cars++;
			}
			for (int i = 0; i < ones.size(); i++) {
				if (passengers + 1 == 4) {
					cars++;
					passengers = 0;
				}
				else if (passengers + 1 > 4) {
					cars++;
					passengers = 1;
				}
				else
					passengers += 1;
			}
		}
		else if (ones.size() < threes.size()){
			while (ones.size() > 0) {
				threes.remove(0);
				ones.remove(0);
				cars++;
			}
			for (int i = 0; i < threes.size(); i++) {
				if (passengers + 3 == 4) {
					cars++;
					passengers = 0;
				}
				else if (passengers + 3 > 4) {
					cars++;
					passengers = 3;
				}
				else
					passengers += 3;
			}
		}
		else {
			while (ones.size() > 0) {
				threes.remove(0);
				ones.remove(0);
				cars++;
			}
		}
		if (passengers > 0)
			cars++;

		System.out.println(cars);
	}
}
