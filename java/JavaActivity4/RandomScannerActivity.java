package JavaActivity_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random indexGen = new Random();
		
		System.out.println("Please Enter the Numbers");
			while (input.hasNextInt())
			{
				list.add(input.nextInt());
			}
			input.close();
		Integer num[] = list.toArray(new Integer[0]);
		int index = indexGen.nextInt(num.length);
		
		System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + num[index]);
        
        
	}
}
