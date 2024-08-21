/*YOU ARE GIVEN A NUMBERB AS INPUT, AND YOU NEED TO DETERMINE IF IT IS A SPY NUMBER OR NOT.
A NUMBER IS SAID TO BE SPY NUMBER IF THE SUM OF ALL THE DIGITS IS EQUAL TO PRODUCT OF ALL DIGITS

INPUT: 123
OUTPUT: 123 IS A SPY NUMBER
*/
package basics;

public class P22 {

	public static void main(String[] args) {

		int n=123;
		int temp = n;
		int sum=0;
		int prod = 1;

		while(n!=0) {
			int digit = n%10;

			sum = sum + digit;
			prod = prod * digit;

			n = n/10;
		}

		if(sum==prod) {
			System.out.println(temp +" IS A SPY NUMBER");
		}
		else {
			System.out.println(temp +" IS NOT A SPY NUMBER");
		}

	}
}
