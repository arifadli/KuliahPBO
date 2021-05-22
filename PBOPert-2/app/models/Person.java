package models;

public class Person {
  public String nama;
  public int noiden;
  private int password;
  
  //ciptakan konstruktor
  public Person(){
	  nama ="Ari Fadli";
	  noiden = 123456;
  }
  
  //ciptakan konstruktor
  public Person(String nama, int noiden){
	  this.nama = nama;
	  this.noiden = noiden;
  }
  
  public String getnama(){
	  return nama;
  }
 
  public int getnoiden(){
	  return noiden;
  }
  
  public int getpassword(){
	  return password;
  }
  
  public void setnama(String name){
	  nama = name;
  }
  
  public void setnoiden(int nomor){
	  noiden = nomor;
  }
  
  public void setpassword(int pwd){
	  password = pwd;
  }
}
