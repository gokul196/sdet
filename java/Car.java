package JavaActivity1;

public class Car {
	
	String color;
	String transmission;
	int make;
    int tyres;
    int doors;

    public Car()
    {
    	tyres = 4;
    	doors = 4;
    }
    
    public void displayCharacteristics()
    {
    	System.out.println("Color = " + color);
    	System.out.println("Transmission = " + transmission);
    	System.out.println("Make = " + make);
    	System.out.println("Tyres = " + tyres);
    	System.out.println("Doors = " + doors);
    }
    
    public static void accelarate()
    {
    	System.out.println("Car is moving forward.");
    }
    
    public static void brake()
    {
    	System.out.println("Car has stopped.");
    }
    
}
