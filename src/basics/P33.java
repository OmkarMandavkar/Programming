//WAP TO CONVERT BINARY TO OCTAL   --> Binary to Decimal to Octal
package basics;

public class P33 {

	public static void main(String[] args) {
		int n = 1011;
		int sum = 0;
		int p = 0;

		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit * pow(2, p); // Can use inbuilt Math.pow() function
			p++;
			n = n / 10;
		}
		System.out.println("Decimal: "+ sum);

		String concatStr = "";

		while (sum != 0) {
			int remainder = sum % 8;

			if (remainder < 10) {
				concatStr = remainder + concatStr;
			} else {
				concatStr = (char) (remainder + 55) + concatStr;
			}
			sum = sum / 8;
		}

		System.out.println("Octal: " + concatStr);

	}

	public static int pow(int n, int p) {

		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * n;
		}
		return res;
	}
}
