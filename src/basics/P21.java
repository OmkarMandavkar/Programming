//WAP TO CHECK WHETHER A NUMBER IS PALINDROME OR NOT.
package basics;

public class P21 {

	public static void main(String[] args) {
		int n = 12421;  
		int rev = 0;
		int comp = n;
		
		while(n != 0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n = n/10;
		}
		
		if(comp==rev) {
			System.out.println("Palindrome Number");
		}
		else
			System.out.println("Not a Palindrome Number");
	}

}
