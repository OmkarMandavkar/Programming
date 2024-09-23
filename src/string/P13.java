//WAP TO FIND THE OCCURENCE OF EACH CHARACTER IN THE STRING

package string;

public class P13 {
	public static void main(String[] args) {
		String s = "maharashtra";

		boolean[] b = new boolean[s.length()];

		for (int i = 0; i < s.length(); i++) {

			if (b[i] == false) {
				int count = 1;

				for (int j = i + 1; j < s.length(); j++) {
					
					if (s.charAt(i) == s.charAt(j)) {
						count++;
						b[j] = true;
					}
				}

				System.out.println(s.charAt(i) + " " + count);
			}
		}
	}
}
