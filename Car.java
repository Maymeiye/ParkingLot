    //Mei Ye
    //23459517
import java.util.Calendar;
import java.util.Date;

public class Car
{
    private String carId;
    private Date enterTime;
    

    
    public Car(String c)
    {
    		carId = c;
    }
    
    public Date setEnterTime()
    {
    		Calendar cal = Calendar.getInstance();
    		enterTime = cal.getTime();
    		System.out.println("Enter time is "+ enterTime);
    		return enterTime;
    }
    
    public Date getEnterTime()
    {
    	    return enterTime;
    }
     
    public String getCarId() 
    {
        return carId;
    }
   
}
