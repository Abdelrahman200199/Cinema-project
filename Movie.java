package project;

public  class  Movie {
    private String type;
 private String language ;
 private String name ;
 private double rate ;
 private String description;
 private String agelimt;
 public Movie(){
     
 }

  public Movie(String type, String language, String name, double rate, String description, String agelimt) {
      this.type = type;
      this.language = language;
      this.name = name;
      this.rate = rate;
      this.description = description;
      this.agelimt = agelimt;
  }
 
 public  void settype (String t)
 {
     type =t;
 }
 public String gettype ()
 {
     return type;
 }
 public void setlanguage (String l)
 {
     language = l;
 }
 public String getlanguage ()
 {
     return language ;
     
 }
 public void setname (String n)
 {
     this.name= n;
     
 }
 public String getname ()
 {
     return name ;
     
 }
 public void setrate(double r)
 {
     rate=r;
     
 }
 public double getrate ()
 {
     return rate;
     
 }
 public void setdescription (String d)
 {
     description=d;
     
 }
 public String getdescription ()
 {
     return description;
 }
 public void setagelimt(String a)
 {
     agelimt=a;
 }
 public String getagelimt()
 {
     return agelimt;
     
 }
 public String tellTeMovieInfo(){
    return (" the type of movie " +type+ " the language of movie " +language+ " the rate of movie " +rate+ " the description of movie  " + description+"the age limt of movie"+agelimt  );
 }
 
}
