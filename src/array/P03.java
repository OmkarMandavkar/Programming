// WAP TO PRINT ALL THE PRIME NUMBERS FROM ARRAY
package array;

public class P03 {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 6, 7, 8, 9, 11, 12, 13 };

		for (int i : arr) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count == 2;
	}
}