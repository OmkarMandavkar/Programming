// 
package string;

public class P14 {
	public static void main(String[] args) {

		String s = "statistics";
//		String s = "falafal";

		int index = -1;
		boolean[] b = new boolean[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (b[i] == false) {
				int count = 1;

				for (int j = i + 1; j < s.length(); j++) {

					if (s.charAt(i) == s.charAt(j)) {
						count++;
						b[j] = true;
					}
				}

				if (count == 1) {
					index = i + 1;
					break;
				}
			}
		}
		
		System.out.println(index);
	}
}