package project;

import java.util.Scanner;
public class Ticket extends Movie {
    private   double price ;
    private String date ;
    private String  time ;
    private String seat;
    
    private String Type ;
    private Showroom SR=new Showroom();
    private Movie movie;

   
  
    
    
    public void setprice(double p)
    {
        price=p;
    }
    public double getprice()
    {
        return price;
        
    }
    public void setdate(String d )
    {
        date =d ;
    }
    public String getdate()
    {
        return date;
    }
    public void settime(String  t )
    {
        time=t;
    }
    public String gettime ()
    {
        return time ;
    }
    public void setseat(String s)
    {
        seat=s;
        
    }
    public String getseat()
    {
        return seat;
        
    }
    public void setType ( String T) 
    {
        Type = T;
    }
    public String getType ()
    {
        return Type;
    }
    public void setSR ( Showroom s){
      SR = s;  
        
    }
    public Showroom getSR(){
        return SR;
    }
   public  void setmovie(Movie m){
       
       movie=m;
   }
   public Movie getmovie(){
       return movie;
       
   }
    public String tellTicketInfo(Showroom showroom ){
    return("the price of ticket\t"+getprice()+"\nthe date of the movie\t"+date+"\nthe time of the movie\t"+ time +"\nthe seat\t" + seat +"\nthe type of movie\t"+ Type +"\nthe showroom of ticket is number\t"+ showroom.getroomNum()+"\nthe showroom of ticket is class \t"+showroom.getroomClass()+"\nthe moviename of ticket\t"+getname());
}
    public void change()
    {Scanner input=new Scanner (System.in);
    int x=input.nextInt();
    
        System.out.println("press 1 to change  the seat");
    System.out.println("press  to change the movie time");
    
    switch(x){
        case 1:
      System.out.println("enter the new seat that you want");
      String y=input.nextLine();
       seat=y;    
      break;
        case 2:
      System.out.println("enter the new time that you want");
    String  z=input.nextLine();
    time=z;
    break;
    }
    }}