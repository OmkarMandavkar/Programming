//FIND OCCURENCE OF ONE STRING INTO ANOTHER STRING
package string;

public class P22 {

	public static void main(String[] args) {

		String s1 = "TimisplayinginhouseTimisagoodkidTim";
		String s2 = "Tim";
		int count = 0;

		while (s1.contains(s2)) {
			count++;

			int x = s1.indexOf(s2) + s2.length();
			s1 = s1.substring(x);
		}
		System.out.println(count);
	}
}