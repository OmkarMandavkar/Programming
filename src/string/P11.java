package string;

public class P11 {
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over a lazy dog ".toLowerCase();

		boolean[] isPresent = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				int x = ch - 'a';
				isPresent[x] = true;
			}
		}

		boolean isPangram = true;

		for (int i = 0; i < isPresent.length; i++) {
			if (isPresent[i] == false) {
				isPangram = false;
				break;
			}
		}

		if (isPangram) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not a Pangram");
		}
	}
}
