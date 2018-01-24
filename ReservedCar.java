    //Mei Ye
    //23459517
public class ReservedCar extends Car 
{
	private int reservedNumber;
	
	public ReservedCar(String c) {
		super(c);		
	}
	public void setReservedNumber(int n)
	{
		System.out.println("Your reserved Id is: " + (n+1234));
		reservedNumber = n;
	}

}
