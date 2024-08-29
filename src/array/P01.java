// WAP TO PRINT ALL THE ELEMENTS PRESENT IN THE ARRAY
package array;

public class P01 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10 };

		System.out.println("FOR LOOP");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("\nFOR EACH LOOP");
		for (int j : arr) {
			System.out.println(j);
		}

		System.out.println("\nWHILE LOOP");
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}

		System.out.println("\nDO WHILE LOOP");
		int k = 0;
		do {
			System.out.println(arr[k]);
			k++;
		} while (k < arr.length);
	}
}
