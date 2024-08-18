//WAP TO SEPARATE EACH DIGIT FROM THE NUMBER
public class P15 {

	public static void main(String[] args) {
		
		int n = -8765;
		
		while(n != 0) {
			int digit = n % 10;
			System.out.println(digit);
			
			n = n / 10;
		}
	}
}