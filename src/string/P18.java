package string;

public class P18 {
	public static void main(String[] args) {

		String s = "java is a programming language";
		String[] arr = s.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}
}
