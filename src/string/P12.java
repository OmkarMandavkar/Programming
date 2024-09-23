//INPUT: MU1M2B3A4I
//OUTPUT: 6MUMBAI10

package string;

public class P12 {
	public static void main(String[] args) {
		
		String str = "MU1M2B3A4I";
		String res = "";

		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				res = res + ch;
			}

			else {
				sum = sum + (ch - '0');
			}
		}
	
		System.out.println(res.length() + res + sum);
	}
}