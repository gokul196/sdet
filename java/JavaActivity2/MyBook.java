package javaActivity_2;

public class MyBook extends Book {

	@Override
	public void setTittle(String bookname) {
		// TODO Auto-generated method stub
		bookname = "Barathiyar Kavithaigal";
		tittle = bookname;
	}
	
	public static void main(String[] args)
	{
		MyBook newNowel = new MyBook();
		
		String bookname = null;
		newNowel.setTittle(bookname);
		System.out.println("The Tittle of the book is " + newNowel.getTittle());
	}
}
