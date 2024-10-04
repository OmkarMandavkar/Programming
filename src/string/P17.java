package string;

public class P17 {
	public static void main(String[] args) {
		String[] arr = { "welcome", "goa", "hi", "bye", "swiss" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (String s : arr) {
			System.out.println(s);
		}
	}
}
