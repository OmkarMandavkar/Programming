package array;

public class P11 {

	public static void main(String[] args) {

		int[] a = { 5, 9, 12, 25, 16 };
		int k = 6;
		int totalDecrement = 0;

		for (int i = 0; i < a.length; i++) {
			totalDecrement = totalDecrement + (a[i] % k);
		}

		System.out.println(totalDecrement);

		/* METHOD 2
		for (int i = 0; i < a.length; i++) {
			while (a[i] % k != 0) {
				a[i]--;
				totalDecrement++;
			}
		}
		System.out.println(totalDecrement);
		*/
	}
}
