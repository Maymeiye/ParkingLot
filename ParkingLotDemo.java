    //Mei Ye
    //23459517
public class ParkingLotDemo
{
	public static void main(String[] args) {
		
		ParkingLot nyParkingLot = new ParkingLot(5, 3);
		//Parking lot can park 5 cars, including 3 reservation parking space
		
		Car njcar1 = new Car("43321");//enter car1
		nyParkingLot.enteraCar(njcar1);
		System.out.println(" ");
		
		Car nycar2 = new Car("99876");//enter car2
		nyParkingLot.enteraCar(nycar2);
		System.out.println(" ");
		
		Car nycar3 = new Car("00987");//enter car3
		nyParkingLot.enteraCar(nycar3);
		System.out.println(" ");
		
		try {
			Thread.sleep(3600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Car a = nyParkingLot.searchaCar("43321");//exit car1
		nyParkingLot.exitaCar(a);
		
		Car b = nyParkingLot.searchaCar("99876");//exit car2
		nyParkingLot.exitaCar(b);
		
		Car c = nyParkingLot.searchaCar("00987");//exit car3
		nyParkingLot.exitaCar(c);
		
		System.out.println(" ");
		
		try {
			Thread.sleep(3600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Car nycar4 = new Car("11987");//enter car4
		nyParkingLot.enteraCar(nycar4);
		System.out.println(" ");
		
		Car nycar5 = new Car("11984");//enter car5
		nyParkingLot.enteraCar(nycar5);
		System.out.println(" ");
		
		try {
			Thread.sleep(3600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Car h = nyParkingLot.searchaCar("11987");//exit car4
		nyParkingLot.exitaCar(h);
		
		System.out.println("----------------------------------- ");
		
		Car nyRcar1 = new Car("99785");//create a reserved car1
		Car nyRcar2 = new Car("44567");//create a reserved car2
		Car nyRcar3 = new Car("33258");//create a reserved car3
		Car nyRcar4 = new Car("77890");//create a reserved car4
		
	    try {
			ReservedCar nyrcar1 = nyParkingLot.reserve(nyRcar1);
			nyParkingLot.enteraCar(nyRcar1);//enter a reserved car1
			System.out.println(" ");
			ReservedCar nyrcar2 = nyParkingLot.reserve(nyRcar2);
			nyParkingLot.enteraCar(nyRcar2);//enter a reserved car2
			System.out.println(" ");
			ReservedCar nyrcar3 = nyParkingLot.reserve(nyRcar3);
			nyParkingLot.enteraCar(nyRcar3);//enter a reserved car3
			System.out.println(" ");
			
			ReservedCar nyrcar4 = nyParkingLot.reserve(nyRcar4);
			nyParkingLot.enteraCar(nyRcar4);//enter a reserved car4
			
		} catch (OutOfReserveSpace e1) {
			
			System.out.println("No Reservation Space!");
			System.out.println(" ");
		}
		
	    try {
			Thread.sleep(3600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println("----------------------------------- ");
	    //Car d = nyParkingLot.searchaCar("11984");//exit car5
		nyParkingLot.exitaCar(nycar5);
		System.out.println(" ");
		
		Car f = nyParkingLot.searchaCar("99785");//exit reserved car1
		nyParkingLot.exitaCar(f);
		System.out.println(" ");
		
		Car g = nyParkingLot.searchaCar("44567");//exit reserved car2
		nyParkingLot.exitaCar(g);
		System.out.println(" ");
	}		
}
