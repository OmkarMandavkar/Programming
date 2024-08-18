/*WAP TO FIND FACTORIAL OF A NUMBER USING BIGINTEGER

BIGINTEGER- it is used to store large value and BigInteger.valueOf() will create an object and it will store the data
*/
import java.math.BigInteger;

public class P10 {
	public static void main(String[] args) {
		int n=50;
		BigInteger fact =  BigInteger.valueOf(1);
		
		for(int i=1; i<=n; i++) {
			BigInteger x =  BigInteger.valueOf(i);
			fact = fact.multiply(x);
		}
		
		System.out.println(fact);
	}
}
