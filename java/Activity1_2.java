package JavaActivity2;

public class Activity1_2 {
	public static void main(String[] args) {
		
		int num[] = {10,77,10,54,-11,10};
		int expvalue = 10;
		int expsum = 30;
		int actsum = 0;
		Boolean result = false;
		
		for (int values:num)
		{
			//Checking for individual 10s
			if (values == expvalue)
			{
				actsum += expvalue;
			}
			
			//Checking for Sum value
			if (actsum == expsum)
			{
				result = true;
			}
		}
		//Printing the match result
		System.out.println("Matches:" + result);
	}
}
