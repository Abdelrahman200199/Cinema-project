package project;

public class User {
    private String name;
 private int id;
 private int age;
 
 private int booktimes;
 
 
public User (){
   
   }

public void setname(String n  ){
  name=n;
}  

public String getname(){
  return name;
}

public void setid(int i){
  id=i;
} 

public int getid(){
  return id;
}



public void setage(int a){
 age=a; 
  
}
public int getage(){
return age;  
  
}




public void  setbooktimes(int b){
   booktimes=b;
    
}

public int getbooktimes(){
  return booktimes;

 
}
public String tellUserInfo()

{
return("the name is "+name+"and the id is"+id+ "and the age is "+age+" and your book times are"+booktimes );
}
public void bonus (int booktimes )
{ int freecredit=0;
if ( booktimes>=5&&booktimes<20){
  freecredit+=50;

}
else if(booktimes >20)
{
 
freecredit+=100;
 
}

}
}
 

