//WAP TO FIND PRODUCT OF ALL ODD DIGITS IN A NUMBER
package basics;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prod = 1;

		while(n!=0) {
			int digit = n%10;
			n = n/10;

			if(digit%2 != 0) {
				prod = prod * digit;
			}
		}
		System.out.println(prod);
	}
}
