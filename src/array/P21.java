/*MAGIC NUMBER: SUM OF GOOD INTEGER - SUM OF BAD INTEGER
GOOD INTEGER: AFTER SORTING THE ARRAY,  THE ELEMENT FOUND AT THE SAME POSITION
*/

package array;

import java.util.Arrays;

public class P21 {
	public static void main(String[] args) {

		int[] arr = { 0, 0, 4, 1, 0, 0, 7, 8, 3, 9 };

		int[] comp = new int[arr.length];

		for (int i = 0; i < comp.length; i++) {
			comp[i] = arr[i];
		}

		Arrays.sort(comp);

		int goodInteger = 0;
		int badInteger = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == comp[i]) {
				goodInteger = goodInteger + arr[i];
			}

			else if (arr[i] != comp[i]) {
				badInteger = badInteger + arr[i];
			}
		}

//		System.out.println();
//		System.out.println(goodInteger);
//		System.out.println(badInteger);

		int magicValue = goodInteger - badInteger;
		System.out.println("MagicVlaue: " + magicValue);

	}

}