//WAP TO REVERSE THE ARRAY

package array;

public class P06 {
	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };

		// METHOD 1
		System.out.print("METHOD 1: ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

		// METHOD 2
		System.out.print("\nMETHOD 2: ");
		int[] b = new int[a.length];

		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			b[j] = a[i];
		}

		for (int i : b) {
			System.out.print(i + " ");
		}

		// METHOD 3: TWO POINTER METHOD
		System.out.print("\nMETHOD 3: ");
		int i = 0, j = a.length - 1;

		while (i < a.length / 2) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for (int k : a) {
			System.out.print(k + " ");
		}
	}
}
