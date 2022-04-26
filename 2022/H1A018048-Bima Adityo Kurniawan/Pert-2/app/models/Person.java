package models;

public class Person {
  public String nama;
  public int noiden;
  
  //ciptakan konstruktor
  public Person(){
	  nama = "Bima Adityo Kurniawan";
	  noiden = 12345;
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
