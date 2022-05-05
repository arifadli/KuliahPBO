package models;

public class Mahasiswa {
  public String nama;
  public String nim;
  
  //ciptakan konstruktor
  public Mahasiswa(){
	  nama = "Muhammad Hendrick Sedayu";
	  nim = "H1A019060";
  }
  
  public String getnama(){
	  return nama;
  }
 
  public String getnim(){
	  return nim;
  }
  
  public void setnama(String name){
	  nama = name;
  }
  
  public void setnim(String no){
	  nim = no;
  }
}