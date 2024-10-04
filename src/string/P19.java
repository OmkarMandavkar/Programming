package string;

public class P19 {

	public static void main(String[] args) {
		String str = "java is a programming language";
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {


			String s = arr[i];
			String rev = "";

			for (int j = s.length() - 1; j >= 0; j--) {
				rev = rev + s.charAt(j);
			}
			System.out.print(rev + " ");
		}
	}
}