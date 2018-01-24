    //Mei Ye
    //23459517
import java.util.*;

public class ParkingLot 
{
	public int capacity;
	public int numberofcar;
	public int reserved_capacity;
	public int numberofreserved;
	public int reservedNumber;
	
	MySet<Car> carSet = new MySet<Car>();
	
	public ParkingLot(int c, int rc)
	{
		capacity = c;
		reserved_capacity = rc;
		numberofcar = 0;
		reservedNumber = 0;
		
		System.out.println("Wellcome to New York ParkingLot!" );
		System.out.println("The ParkingLot is allow to park " + (capacity - numberofcar) +" cars." );
		System.out.println("There are " + reserved_capacity + " reservation spaces!");
		System.out.println("");
	}

	public void enteraCar( Car aCar )
	{
		
		if(numberofcar < capacity)
		{
			aCar.setEnterTime();
			carSet.insert(aCar);
			numberofcar++;
			System.out.println("Enter a Car: " + aCar.getCarId());
			System.out.println("Now the Parking lot has " 
			+ numberofcar + " cars." );	
		}
		else System.out.println("Parking is full.");
	}
	
	public Car searchaCar(String id)
	{
        ArrayList<Car> a = carSet.getArrayList();
        for ( int i = 0; i < a.size(); i++ )
        {
        	    if ( a.get(i).getCarId().equals(id) ) return a.get(i);
        }
		return null;     
	}
	
	public void exitaCar( Car aCar )
	{
		carSet.delete(aCar);
		System.out.println("Exit a car: " + aCar.getCarId());

	    ParkingFees.calculateFee(aCar);
	    
		numberofcar = numberofcar - 1;
		
		if ( aCar instanceof ReservedCar ) numberofreserved--;
		System.out.println("Now the Parking lot has " + numberofcar + " cars." );	
	    
	}
	
	public ReservedCar reserve(Car aCar) throws OutOfReserveSpace
	{

		if (numberofreserved < reserved_capacity)
		{
			ReservedCar rc = new ReservedCar(aCar.getCarId());
			rc.setReservedNumber(numberofreserved++);
		    return rc;
		}
		else
		{
			throw new OutOfReserveSpace();
		}
	}
	
}
