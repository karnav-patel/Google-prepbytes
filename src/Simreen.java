/*
 * 
 * Logic and Algorithm: Simreen Kaur
 * Author: Karnav Patel
 * Date: 9/28/2019
 * 
 * A code that finds the closest greater number. 
 */

import java.util.*;

public class Simreen {
	private static ArrayList<String> ar = new ArrayList<String>();
	static int c = 0;

	void display(String s1, String s2, int j) {
		if (s2.length() <= 1) {
			c++;
			ar.add(s1 + s2);
		} else {
			for (int i = 0; i < s2.length(); i++) {
				String x = s2.substring(i, i + 1);
				String y = s2.substring(0, i);
				String z = s2.substring(i + 1);
				display(s1 + x, y + z, j = j + 1);
			}
		}
	}

	public static void main(String args[]) throws Exception {
		Simreen ob = new Simreen();
		// ob.input();

		int y = 0;
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String s = scanner.next();
		ob.display("", s, i);
		int[] lop = new int[ar.size()];
		int p = 0;
		int sim = 0;
		for (String oo : ar) {
			int h = Integer.parseInt(oo);
			lop[p] = h;
			p++;
		}
		int count = 0;
		for (int k = 0; k < lop.length - 1; k++) {
			if (lop[i] > lop[i + 1]) {
				count++;
			}
		}
		if (count == lop.length-1) {
			System.out.println("Invalid Output");
			return;
		}
		sim = lop[0];
		Arrays.sort(lop);

		for (int h = 0; h <= ar.size(); h++) {
			if (lop[h] > sim) {
				System.out.println(lop[h]);
				break;
			}

		}
	}
}