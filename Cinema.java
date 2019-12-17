package project;
public class Cinema {
    private String name ;
    private String address;
    private double rateFrom10;
    
    public Cinema()
    { 
    }
    public void setname (String n)
    {
        name=n;
    }
    public String getname()
    {
        return name;
    }
     public void setadddress ( String a)
     {
         address=a;
     }
     public String getaddress ()
     {
         return address;
     }
     public void setrateFrom10(double r )
     {
         rateFrom10=r;
     }
     public double getrateFrom10()
     {
         return  rateFrom10;
     }
     public String tellTheCinemaInfo(){
         
        return("the name of the cinema is "+name+" the address of the cinema is "+address+" the rate of the cinema is "+rateFrom10); 
     }
}
