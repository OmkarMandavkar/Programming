//WAP to remove all spaces from the string.
//Input - java is a programming language
//Output - javaisaprogramminglanguage

package string;

public class P05 {
	public static void main(String[] args) {

		String str = "java is a programming language";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				res = res + str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
