package javaActivity_2;

public class EncapsulationActivity {
	
	public static void main(String[] args)
	{
		Plane plane = new Plane(10);
		
		plane.onboard("Gokul");
		plane.onboard("sastha");
		plane.onboard("Krish");
		
		System.out.println("Departure Time :" + plane.takeOff());
		
		System.out.println("Passengers List Onboarded:" + plane.getPassesngers());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		plane.land();
		
		System.out.println("Arrival Time :" + plane.getLastTimeLanded());
		
		System.out.println("Passenger List left on the Plane after arrival :" + plane.getPassesngers());

	}
}
