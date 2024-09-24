//WAP to convert the lowercase characters in string to uppercase characters without using inbuilt methods .
//Input - java
//Output - JAVA

package string;

public class P06 {
	public static void main(String[] args) {

		String str = "ja@vaA567";
		String res = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				res = res + (char) (ch - 32);
			} 
			else {
				res = res + ch;
			}

		}
		System.out.println(res);
	}
}
