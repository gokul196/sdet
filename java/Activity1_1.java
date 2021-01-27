package JavaActivity1;

public class Activity1_1 {
	
	public static void main(String[] args) {
	//Instantiating the Car Class
	Car car = new Car();
    car.make = 2014;
    car.color = "Black";
    car.transmission = "Manual";
    
    //Invoking the Car methods
    car.displayCharacteristics();
    Car.accelarate();
    Car.brake();
}
}
