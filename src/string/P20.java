package string;

public class P20 {
	public static void main(String[] args) {

		String s1 = "apple";
		String s2 = "samsung";

		System.out.println("Before Swapping: ");
		System.out.println("S1 --> " + s1);
		System.out.println("S2 --> " + s2);

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("\nAfter Swapping: ");
		System.out.println("S1 --> " + s1);
		System.out.println("S2 --> " + s2);
	}
}
