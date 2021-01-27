package JavaActivity4;

import java.util.Arrays;

public class Activity1_4 {
	public static void main(String[] args)
	{
		int[] num = { 50, 55, 1, 4, 3, 9, 2 };
		int length = num.length;
        
        for (int i = 1; i < length; i++) {
            int temp = num[i];
            int j = i - 1;
            
            while (j >= 0 && temp < num[j]) {
            	//Setting Lower value to next place
            	num[j + 1] = num[j];
                j=j-1;
            }
            //Setting Higher value to previous place
            num[j + 1] = temp;
        }
        //Print Sorted Array
        System.out.println("InsertionSort output" + Arrays.toString(num));   
	}
}
