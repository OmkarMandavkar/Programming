//WAP TO CONVERT BINARY TO DECIMAL
package basics;

public class P32 {

	public static void main(String[] args) {
		int n = 11011;
		int sum = 0;
		int p = 0;

		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit * pow(2, p);
			p++;
			n = n / 10;
		}
		System.out.println(sum);
	}

	public static int pow(int n, int p) {

		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * n;
		}
		return res;
	}
}
