package javaActivity_3;

import java.util.HashMap;

public class Activity3_3 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("Name", "Gokul");
    	
        hm.put("Age", "28");
	
        hm.put("Company", "IBM");
	
        hm.put("Designation From", "Test Specialist - Middleware");
	
        hm.put("Designation To", "Test Specialist - SDET");
        
        System.out.println("Employee Detail : " + hm);
        
        hm.remove("Age");
        
        System.out.println("Check if Company is IBM : " + hm.containsValue("IBM"));
        System.out.println("No of details available : " + hm.size());
	}

}
