//WAP TO FIND THE PERCENTAGE OF UPPERCASE, LOWERCASE, NUMBER, SPECIAL CHARACTER IN THE STRING

//INPUT: Aa1@
//OUTPUT: UPPER-25%		LOWER-25%		NUMBER-25%		SPL CHAR-25%

package string;

public class P16 {

	public static void main(String[] args) {
		String str = "Aa122jJJHH!#@";
		
		float upper = 0.0f, lower = 0.0f, digit = 0.0f, special = 0.0f;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				upper++;
			} else if (ch >= 'A' && ch <= 'Z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				digit++;
			} else {
				special++;
			}
		}

		System.out.println("Upper: " + (upper / str.length()) * 100);
		System.out.println("Lower: " + (lower / str.length()) * 100);
		System.out.println("Number: " + (digit / str.length()) * 100);
		System.out.println("Special: " + (special / str.length()) * 100);
	}

}
