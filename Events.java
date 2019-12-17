package project;

public class Events {
    private int minNum=20;
	private int numOfSeats;
	public Events() {
	}

     public void setminNum(int m)
{
    minNum=m;
}
  public int getminNum()
  {
      return minNum;
  }
   public void setnumOfSeats(int n)
   {
       numOfSeats=n;
   }
   public int getnumOfSeats()
   {
       return numOfSeats;
   }
  
	
public String SpecialPriceForTheChair()
{
	if(numOfSeats<minNum)
		System.out.println ("you cant have an event with less than 20  chair");	
	int price = 0;
	 if(20<numOfSeats&&numOfSeats<100)
		 {
		price=50;
		 }
		 
	else if(numOfSeats>100)
		 { price=30;
		 
		 }
	return"your special price for the chair is "+price;
}
}
