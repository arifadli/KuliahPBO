package models;

public class Sensor {
  private String sensor;
  public int noiden;
  private 
  
  //ciptakan konstruktor
  public Sensor(){
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