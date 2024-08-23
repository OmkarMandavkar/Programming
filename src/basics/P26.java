//WAP TO CHECK WHETHER A NUMBER IS ARMSTRONG NUMBER OR NOT

package basics;

import java.util.Scanner;

public class P26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int temp = n;

		int count = (int) (Math.log10(n) + 1);

		while (n != 0) {
			int digit = n % 10;
			int prod = 1;

			for (int i = 1; i <= count; i++) {
				prod = prod * digit;
			}
			sum = sum + prod;
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}
}
