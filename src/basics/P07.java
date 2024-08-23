//WAP TO PRINT ALL THE FACTORS OF A NUMBER
package basics;

import java.util.Scanner;

public class P07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=1; i<=n/2; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}

}
