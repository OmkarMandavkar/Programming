//WAP to find the toggle of the string where lowercase characters converted in uppercase and uppercase characters converted in lowercase.
//Input - HeLlO WoRLD
//Output - hElLo wOrld 

package string;

public class P07 {

	public static void main(String[] args) {
		String str = "HeLlO WoRLD";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			}

			else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		String res = new String(ch);
		System.out.println(res);
	}
}


/*
String res = "";
for (int i = 0; i < str.length(); i++) {

	char ch = str.charAt(i);
	if (ch >= 'a' && ch <= 'z') {
		res = res + (char) (ch - 32);
	} 
	else if (ch >= 'A' && ch <= 'Z') {
		res = res + (char) (ch + 32);
	} 
	else {
		res = res + ch;
	}

}
*/