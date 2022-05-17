package models;

public class Person {
  public String nama;
  public int noiden;
  
  public Person(){
	  nama = "M Fikra Adzaky";
	  noiden = 19083;
  }
  
  public String getnama(){
	  return nama;
  }
 
  public int getnoiden(){
	  return noiden;
  }
  
  public void setnama(String name){
	  nama = name;
  }
  
  public void setnoiden(int no){
	  noiden = no;
  }
}
