package models;

public class Person {
  public String nama;
  public int noiden;
  
  //ciptakan konstruktor
  public Person(){
	  nama="Ari Fadli";
	  noiden = 123456;
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
  
  public void setnoiden(int nomor){
	  noiden = nomor;
  }
}
