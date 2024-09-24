//WAP TO FIND TOTAL NUMBER OF VOWELS PRESENT IN A STRING

package string;

public class P03 {
	public static void main(String[] args) {

		String str = "Education";
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {

			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}
}