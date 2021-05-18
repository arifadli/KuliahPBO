package models;

public class Person {
  public String nama;
  public int noiden;
  private int nohp;
  private int norek;
  
  //ciptakan konstruktor
  public Person(String nama, int noiden, int nohp, int norek){
	  this.nama ="Ari Fadli";
	  this.noiden = 123456;
	  this.nohp = 67890;
	  this.norek = 123098;
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
