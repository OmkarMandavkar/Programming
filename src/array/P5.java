//WAP TO FIND THE SECOND LARGEST ELEMENT IN A ARRAY
package array;

public class P5 {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 6, 7, 8, 9, 11, 12, 13 };
		int large = Integer.MIN_VALUE;
		int sec_large = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				sec_large = large;
				large = arr[i];
			} else if (arr[i] > sec_large && arr[i] != large) {
				sec_large = arr[i];
			}
		}

		System.out.println("Largest: " + large);
		System.out.println("Second Largest: " + sec_large);
	}
}
