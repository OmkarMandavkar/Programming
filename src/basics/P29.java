//WAP TO CONVERT DECIMAL INTO BINARY
package basics;

public class P29 {
	public static void main(String[] args) {

		int decimal = 36;
		System.out.println(Integer.toBinaryString(decimal));
		String binary = "";

		while(decimal != 0) {
			int remainder = decimal % 2;
			binary = remainder + binary;
			decimal = decimal / 2;
		}
		System.out.println(binary);
	}
}
