// WAP TO GENERATE A RANDOM PASSWORD OF LENGTH 5 WHICH CONSIST OF LOWERCASE AND UPPERCASE ALPHABETS

package string;

import java.util.Random;

public class P08 {
	public static void main(String[] args) {
		String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String pwd = "";

		Random r = new Random();

		while (pwd.length() < 5) {
			int random = r.nextInt(alphabets.length());
			char ch = alphabets.charAt(random);
			pwd = pwd + ch;
		}
		System.out.println(pwd);
	}
}