package basics;
import java.util.Scanner;

public class P04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time: ");
		int time = sc.nextInt();

		System.out.print("Enter distance: ");
		int dist = sc.nextInt();

		farecalculate(time, dist);
	}

	/*
	 TEST CASES
	 1. t<=8hr and dis<=250km ---> 2000 rs
	 2. t<=8hr and dis>250km ---> 2000 + 20/km for additional kms
	 3. t>8hr and dis<250km ---> 2000 + 100/hr for additional hrs
	 4. t>8hr and dis>250km ---> consider additional distance travelled only not additional hrs
	 5. distance = 0 ---> Print Error
	*/

	public static void farecalculate(int time, int dist) {

		if(dist<=0 || time<=0) {
			System.out.println("Invalid Input");
		}
		else if(time<=8 && dist<=250 ) {
			System.out.println(2000);
		}
		else if(time<=8 && dist>250 ) {
			System.out.println(2000 + (dist-250)*20);
		}
		else if(time>8 && dist<=250 ) {
			System.out.println(2000 + (time-8)*100);
		}
		else if(time>8 && dist>250 ) {
			System.out.println(2000 + (dist-250)*20);
		}
	}
}



/*
Rental Caarrz Inc., is a car rental service company which allows the users to rent out the cars based on the following tariff. Anybody who wishes to use this service, can pick up the car from one of the outlets and pay the charges upon return of the car. 

The rental tariff is as follows:
 * The user would be charged a flat amount of Rs. 2000/- if the user returns in less than 8hours of hiring and drives less than 250kms.

 * If the user rides more than 250 kms but returns the car within 8 hours, would be charged Rs. 20/- per km for the additional kilometres that he rides.

 * If the user returns the car after 8 hours hiring but drove less than 250 kms, then he would be charged Rs. 100/- per hour for every additional hour.

 * If the user rides more than 250 kms and returns after 8 hours, then only the additional distance traveled would be considered: not the additional hours.

Consider an example where the user rents out a car and returns it after 6 hours. The total distance in the odometer shows up as 200 Kms. Since, the usage is less than 250Kms and also 8 hours, then the flat charge of 2000/- would be charged.

The distance traveled had been 300Kms, then it is 50 Kms more than minimum distance used for calculation. Since, the car has been returned within 8 hours, so it should not considered for calculations. Therefore, the computation would be?
2000 + (50 x 20) = ? 3000.

If an invalid input is given,
for e.g
the distance traveled is 0 km, then the following error should be displayed.
Invalid Input*/
