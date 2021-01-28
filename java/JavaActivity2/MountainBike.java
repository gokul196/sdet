package javaActivity_2;

public class MountainBike extends Bicycle{
	public int seatHeight;
	
	public MountainBike(int gears, int speed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super.Bicycle(gears, speed);
        seatHeight = startHeight;
    }
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
	
	public static void main(String args[]) {
	    MountainBike mb = new MountainBike(3, 0, 25);
	    System.out.println(mb.bicycleDesc());
	    mb.speedUp(20);
	    mb.speedUp(20);
	    mb.applyBrake(5);
	}

}
