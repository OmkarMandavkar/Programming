//

package array;

public class P20 {

	public static void main(String[] args) {
		
		int[][] a = { { 454, 55, 521, 14 }, { 78, 326, 104, 989 }, { 23447, 174, 87, 845 }, { 25, 81, 53, 11 } };
		int x = 104;
		int sumRC = 0;
		
		outer: for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if (x == a[i][j]) {
					sumRC = i + j;
					break outer;
				}
			}
		}
		
		int totalSum = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
		
				if (sumRC % 2 == 0 && a[i][j] % 2 == 0) {
					totalSum = totalSum + sumOfDigits(a[i][j]);
				} 
				else if (sumRC % 2 != 0 && a[i][j] % 2 != 0) {
					totalSum = totalSum + sumOfDigits(a[i][j]);
				}
			}
		}
		
		System.out.println(totalSum);
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		return sum;
	}
}
