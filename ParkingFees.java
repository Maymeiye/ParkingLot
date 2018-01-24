    //Mei Ye
    //23459517
import java.util.Calendar;
import java.util.Date;

public class ParkingFees 
{
	public static int[] 
	parkingFees = { 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 10 };
	
	public static void calculateFee(Car aCar)
	{
		Calendar cal2 = Calendar.getInstance();
		Date exitTime = cal2.getTime();
		//System.out.println(aCar.getEnterTime().getTime());
		long parkingTime = exitTime.getTime() - aCar.getEnterTime().getTime();
		//System.out.println(parkingTime);
		int payTime = (int) Math.ceil( (double) parkingTime / 1000);
		System.out.println("Exit time is " + exitTime);
		int parkingFee;
		if (payTime > 12) parkingFee = 10;
		else parkingFee = parkingFees[payTime];
	    System.out.print("You parking time is ");
		System.out.print(payTime);
		System.out.println(" hours.");
	    System.out.println("You parking fee is $" + parkingFee + ".00. Please pay with cash or credit card.");
	    System.out.println(" ");
	}
}
