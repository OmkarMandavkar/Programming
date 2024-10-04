package string;

public class P21 {
	public static void main(String[] args) {

		String s1 = "apple";
		String s2 = "samsung";

		System.out.println("Before Swapping: ");
		System.out.println("S1 --> " + s1);
		System.out.println("S2 --> " + s2);

		String temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println("\nAfter Swapping: ");
		System.out.println("S1 --> " + s1);
		System.out.println("S2 --> " + s2);
	}
}
