// WAP TO REVERSE THE ELEMENTS PRESENT IN THE ARRAY
// INPUT: 15 74 63 14 25
// OUTPUT: 51 47 36 41 52
package array;

public class P7 {

	public static void main(String[] args) {
		int[] arr = { 15, 74, 63, 14, 25 };

		for (int i = 0; i < arr.length; i++) {

			System.out.println(revNum(arr[i]) + " ");
			// arr[i] = revNum(arr[i]);

		}

	}

	public static int revNum(int n) {

		int rev = 0;
		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}

		return rev;
	}

}
