/*
WAP to remove all the vowels from the string.
Input - education
Output - dctn

*/

package string;

public class P04 {
	public static void main(String[] args) {
		String str = "education";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				res = res + ch;
			}
		}
		System.out.println(str);
		System.out.println(res);
	}
}
