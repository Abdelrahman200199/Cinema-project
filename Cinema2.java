package project;

//import cinema2.Events;
//import cinema2.Movie;
//import cinema2.Showroom;
//import cinema2.Ticket;
//import cinema2.User;
//import cinema2.BookAtaxi;
//import cinema2.Cinema;
import java.util.Scanner;

public class Cinema2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Showroom sr1 = new Showroom();
        Events e1 = new Events();
        BookAtaxi b1 = new BookAtaxi();
Cinema c3 =new Cinema();
        for (int i = 0; i < 220; i++) {
            System.out.print("=");

        }

        
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t" + "Cinema");
        for (int i = 0; i < 220; i++) {
            System.out.print("=");

        }
         User U1 = new User();
         System.out.println(" welcome to the sinema booking system ");
            System.out.println("please enter your name");

            String name = input.nextLine();
            U1.setname(name);
            System.out.println("please enter your age");
            int age = input.nextInt();
            U1.setage(age);
            int id = (int) (Math.random() * 10000);
            System.out.println("your id is " + id);
            U1.setid(id);

          
            

            
        Ticket newm = new Ticket();
        Ticket m1 = new Ticket();
        Ticket m2 = new Ticket();
        Ticket m3 = new Ticket();
        Ticket m4 = new Ticket();
        Ticket m5 = new Ticket();
        m1.setagelimt("+18");
        m1.setdescription("very good movie");
        m1.setlanguage("english");
        m1.setname("jocker");
        m1.setrate(9.2);
        m1.settype("action");

        m2.setagelimt("+12");
        m2.setdescription("very good movie");
        m2.setlanguage("english");
        m2.setname("biti");
        m2.setrate(9.8);
        m2.settype("comdy ");

        m3.setagelimt("+0");
        m3.setdescription("good movie ");
        m3.setlanguage("english ");
        m3.setname("the hang over ");
        m3.setrate(7.1);
        m3.settype("animation ");

        m4.setagelimt("+6");
        m4.setdescription("very good movie");
        m4.setlanguage("arabic");
        m4.setname("ßÏÉ ÑÖÇ ");
        m4.setrate(5.2);
        m4.settype("action");

        m5.setagelimt("+10");
        m5.setdescription("very romanntic movie");
        m5.setlanguage("english");
        m5.setname("love");
        m5.setrate(6.2);
        m5.settype("romantic");
        int a;
        do {
            System.out.println("*******************************************************************************************************");
            System.out.println("These are the movies that you can watch at the cinemas right now press the movie num to see its infromation :- ");
            System.out.println("__________________________________________________________________________________________________________________");
            System.out.println("1." + m1.getname());
            System.out.println("2." + m2.getname());
            System.out.println("3." + m3.getname());
            System.out.println("4." + m4.getname());
            System.out.println("5." + m5.getname());
            System.out.println("press 0 to continue ");
            a = input.nextInt();

            switch (a) {
                case 1:
                    System.out.println(m1.tellTeMovieInfo());
                    break;
                case 2:
                    System.out.println(m2.tellTeMovieInfo());
                    break;
                case 3:
                    System.out.println(m3.tellTeMovieInfo());
                    break;
                case 4:
                    System.out.println(m4.tellTeMovieInfo());
                    break;
                case 5:
                    System.out.println(m5.tellTeMovieInfo());
                    break;
            }
             
             } while (a != 0);
        int on = 1;
        
       do { 
        try{
            
         
        System.out.println("please enter the Number of The  Movie you want to book ");
        int num = input.nextInt();
        switch (num) {
            case 1:

                newm = m1;
                on=2;
                break;
            case 2:

                newm = m2;
                on=2;
                break;
            case 3:

                newm = m3;
                on=2;
                break;
            case 4:

                newm = m4;
                on=2;
                break;
            case 5:

                newm = m5;
                on=2;
                break;
 
                default:
                    on=1;
                    System.out.println("invalid number");
        }}
        
        catch(Exception  e){
                System.out.println("invalid number input ");
                
                }
    } while(on == 1);     
        m1.setmovie(newm);
        System.out.println(" enter the date that you want to watch the movie in");

        String date = input.next();
        newm.setdate(date);
        System.out.println(" enter the time that you want ");

        String time = input.next();
        newm.settime(time);
        System.out.println(" do you want to make an event ");
        char c = input.next().charAt(0);
        switch (c) {
            case 'y':
                System.out.println("enter the number of tickets you want to book it ");
                int e = input.nextInt();
                e1.setnumOfSeats(e);
              e1.SpecialPriceForTheChair();  
                
                break;
            case 'n':
            	 break;
        }
       
                System.out.println("enter the seat that you want");

                String seat = input.next();
                newm.setseat(seat);
                sr1.setseat(seat);
              
         	
        int on1=1;
               do {
            		  try {
                System.out.println("do you want to book a taxi (press y or n) ");
                char c1 = input.next().charAt(0);

                switch (c1) {
                    case 'y':
                        System.out.println(" what is your address ");
                        input.nextLine();
                        String address = input.nextLine();
                        b1.setuserAddress(address);
                        System.out.println("what kind of car do you want ");
                        String k = input.nextLine();
                        b1.setcarType(k);
                        System.out.println(b1.TheRideInfo());
                        on1=0;
                        break;
                    case 'n':
                       on1=0;
                    	break;
                }
              }
              catch(Exception k) 
             
            		  {
            	  System.out.println("invalud input");
              }
               }while(on1==1);
                System.out.println("enter the type you want");

                String type = input.next();
                newm.setType(type);

                System.out.println("chose one from the four showrooms (room 1 and 2 are vip rooms, but room 3 and 4 are ordinary rooms )");

                int srnum = input.nextInt();
                if (srnum == 1 || srnum == 2) {
                    sr1.setroomClass("vip");
                    newm.setprice(120);
                    
                    if (srnum == 1) {
                        sr1.setroomNum(1);
                    } else {
                        sr1.setroomNum(2);
                    }

                } else if (srnum == 3 || srnum == 4) {
                    newm.setprice(90);
                    
                    sr1.setroomClass("ordinary");
                     if (srnum == 3) {
                        sr1.setroomNum(3);
                    } else {
                        sr1.setroomNum(4);
                    }
                }

                System.out.println(newm.tellTicketInfo(sr1));
int on3=0;
do {    
try {
      System.out.println("please chose the cinema that you want to book in 1- City Stars , 2- Cairo festival , 3- mall of Egypt");
     int  choice=input.nextInt();
    
       switch (choice)
      {
          case 1: 
        	  c3.setname("City Stars");
        	  c3.setadddress("Omar Ibn El-Khattab, Masaken Al Mohandesin, Nasr City, Cairo Governorate");
             on3=1;
              break;
          case 2 :
        	  c3.setname("Cairo festival");
        	  c3.setadddress("El tagmo3 el khames");
              on3=1;
              break;
          case 3:
        	  c3.setname("mall of Egypt");
        	  c3.setadddress("6 October city");
   on3=1;
        	  break;
    default:
    	System.out.println("please enter a valid number");
             
      }
    }catch(Exception e) 
    {
    	System.out.println("please enter a number");
    	
    }
}while(on3==0);
      
      System.out.println("you have booked in"+c3.getname()+"\n and its address is"+c3.getaddress());
      
   


    




    }
}
