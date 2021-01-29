package javaActivity_3;

import java.util.HashSet;

public class Activity3_2 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Gokul");
		hs.add("Krish");
		hs.add("Krishnan");
		hs.add("Mahi");
		
		System.out.println("List of name :" + hs);
		System.out.println("List of name :" + hs.size());
		
		hs.remove("Krish");
		hs.remove("Billa");
		
		System.out.println("No of names : " + hs.contains("Mahi"));

		System.out.println("List of name-final :" + hs.size());
	}

}
