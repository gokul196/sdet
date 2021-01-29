package javaActivity_3;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args){
		{
			ArrayList<String> myList = new ArrayList<>();
			myList.add("Gokul");
			myList.add("Krish");
			myList.add("Sastha");
			myList.add(0,"Gokulakrishnan");
			myList.add(4,"Asuran");
			
			for(String name : myList)
			{
				System.out.println("List of Names :" + name);
			}
			
			System.out.println("Third Name : " + myList.get(2));
			System.out.println("Is there a name present with Sastha : " + myList.contains("Sastha") );
			System.out.println("No of Names :" + myList.size());
			
			myList.remove(0);
			System.out.println("No of Names-Final :" + myList.size());			
		}
	}
}
