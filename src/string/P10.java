//WAP TO CHECK WHETHER A STRING IS PANGRAM OR NOT

package string;

import java.util.HashSet;

public class P10 {
	public static void main(String[] args) {
		String s1 = "The quick brown fox jumps over a lazy dog ".toLowerCase();

		char[] ch = s1.toCharArray();

		HashSet<Character> hs = new HashSet<Character>();

		for (Character character : ch) {
			if (character >= 'a' && character <= 'z') {
				hs.add(character);
			}
		}

//		Iterator<Character> i = hs.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}

		if (hs.size() == 26) {
			System.out.println("Pangram");
		} else {
			System.out.println("Not a Pangram");
		}
	}
}
