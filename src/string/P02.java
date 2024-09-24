//WAP TO CHECK WHETHER IF THE STRING IS PALINDROME OR NOT

package string;

public class P02 {
	public static void main(String[] args) {

		String s = "madAm";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} 
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
