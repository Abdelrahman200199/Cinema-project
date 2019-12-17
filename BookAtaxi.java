package project;

public class BookAtaxi {
private String carType;
private String userAddress;
public BookAtaxi(){
}
public void setcarType(String c)
{
    carType=c;
}
public String getcarType()
{
    return carType;
}
public void setuserAddress(String u)
{
    userAddress=u;
}
public String getuserAddress()
{
    return userAddress;
}




public String TheRideInfo() {
	return " carType=" + carType +
			", userAddress=" +userAddress ;

    
}
}