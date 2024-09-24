//WAP TO CHECH WHETHER A STRING IS ANAGRAM OR NOT

package string;

import java.util.Arrays;

public class P09 {
	public static void main(String[] args) {
		String s1 = "cat".replace(" " ,"").toLowerCase();
		String s2 = "Act ".replace(" " ,"").toLowerCase();
		
		if(s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
//			boolean isAnagram = true;
//			for(int i=0; i<ch2.length; i++) {
//				if(ch1[i] != ch2[i]) {
//					isAnagram = false;
//					break;
//				}
//			}
			
			boolean isAnagram = Arrays.equals(ch1, ch2);
			
			if(isAnagram) {
				System.out.println("ANAGRAM");
			}
			else {
				System.out.println("NOT AN ANAGRAM");
			}
		}
		else {
			System.out.println("NOT AN ANAGRAM : DIFFERENT LENGTH");
		}
	}
}