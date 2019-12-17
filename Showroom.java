package project;

public class Showroom {
    private int roomNum;
 private String roomClass;
 private String seat;

public  Showroom()
{
   
}
public void setseat(String s)
{
   seat=s;
   
}
public String getseat()
{
   return seat;
   
}
public  void setroomNum( int n)
{
  
 
 
     
  this. roomNum=n;
}
public int getroomNum()
{
  return roomNum;
  
}
public void setroomClass(String r)
{
  this.roomClass=r;
  
}
public String getroomClass()
{
  return roomClass;
  
}
public String tellTheRoomInfo()

{
  return("your seat is "+seat+"the roomclass is"+roomClass+"the roomnum is"+roomNum);
  
}

}
