package javaActivity_2;

public class Activity2_4 {

	public static void exceptionTest(String string) throws CustomException
	{
		if(string == null) {
            throw new CustomException("Null value");
        } else {
            System.out.println(string);
        }
	}
	
	public static void main(String[] args)
	{
		try {
            Activity2_4.exceptionTest("No Error");
            Activity2_4.exceptionTest("Value Available");
            Activity2_4.exceptionTest(null);
            Activity2_4.exceptionTest("Value Available");
        } catch(CustomException msg) {
            System.out.println("Custom Exception: " + msg.getMessage());
        }
	}
}
