//WAP TO REVERSE THE NUMBER
package basics;

public class P20 {

	public static void main(String[] args) {
		int n = 1234;
		int rev = 0;

		while(n!=0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n = n/10;
		}
		System.out.println(rev);
	}
}
