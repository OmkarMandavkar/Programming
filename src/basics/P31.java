//WAP TO CONVERT DECIMAL TO HEXADECIMAL
package basics;

public class P31 {

	public static void main(String[] args) {

		int n = 12;
		System.out.println(Integer.toHexString(n));
		int base = 16; // 2, 8
		String concatStr = "";

		while (n != 0) {
			int remainder = n % base;

			if (remainder < 10) {
				concatStr = remainder + concatStr;
			} else {
				concatStr = (char) (remainder + 55) + concatStr;
			}
			n = n / base;
		}
		System.out.println(concatStr);
	}
}