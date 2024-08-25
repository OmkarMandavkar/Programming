//WAP TO CONVERT DECIMAL INTO OCTAL
package basics;

public class P30 {
	public static void main(String[] args) {

		int decimal = 36;
		System.out.println(Integer.toOctalString(decimal));
		String octal = "";

		while(decimal != 0) {
			int remainder = decimal % 8;
			octal = remainder + octal;
			decimal = decimal / 8;
		}
		System.out.println(octal);
	}
}
