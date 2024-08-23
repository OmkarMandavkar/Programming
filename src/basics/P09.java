/*
 WAP TO CHECK IF THE NUMBER IS A PERFECT NUMBER OR NOT. IF IT IS A PERFECT NUMBER THEN DISPLAY "PRFECT NUMBER" OR ELSE DISPLAY "NOT A PERRECT NUMBER".

 A PERFECT NUMBER IS A NUMBER WHOSE SUM OF THE FACTORS EXCLUDING THE NUMBER IS EQUAL TO THE INPUT.

 SAMPLE INPUT: 6 --> PERFECT NUMBER
 SAMPLE INPUT: 27 --> NOT A PERFECT NUMBER

 */
package basics;

import java.util.Scanner;

public class P09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for(int i=1; i<=n/2; i++) {
			if(n%i == 0) {
				sum = sum + i;
			}
		}

		if(n==sum) {
			System.out.println("Perfect Number");
		}
		else
			System.out.println("Not a Perfect Number");
	}
}
