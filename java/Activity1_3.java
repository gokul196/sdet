package JavaActivity3;

public class Activity1_3 {
    public static void main(String args[]) {
    	int secs = 1000000000;
	
    	int Earthsecs = 31557600;
    	//Assuming Blow are seconds
    	double Mercurysecs = 0.2408467;
    	double Venussecs = 0.61519726;
    	double Marssecs = 1.8808158;
    	double Jupitersecs = 11.862615;
    	double Saturnsecs = 29.447498;
    	double Uranussecs = 84.016846;
    	double Neptunesecs = 164.79132;
    	
    	//Calculating the Age values
    	double earthage = secs / Earthsecs;
    	double merage = secs / Earthsecs / Mercurysecs;
    	double venage = secs / Earthsecs / Venussecs;
    	double marage = secs / Earthsecs / Marssecs;
    	double jupage = secs / Earthsecs / Jupitersecs;
    	double satage = secs / Earthsecs / Saturnsecs;
    	double uraage = secs / Earthsecs / Uranussecs;
    	double nepage = secs / Earthsecs / Neptunesecs;    	
    	
    	//Printing the Calculated Age values
    	System.out.println("Age on Earth: " + earthage + " years old");
    	System.out.println("Age on Mercury: " + merage + " years old");
    	System.out.println("Age on Venus: " + venage + " years old");
    	System.out.println("Age on Mars: " + marage + " years old");
    	System.out.println("Age on Jupiter: " + jupage + " years old");
    	System.out.println("Age on Saturn: " + satage + " years old");
    	System.out.println("Age on Uranus: " + uraage + " years old");
    	System.out.println("Age on Neptune: " + nepage + " years old");
    }
}
