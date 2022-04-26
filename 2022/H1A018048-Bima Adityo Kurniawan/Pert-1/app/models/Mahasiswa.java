package models;

public class Mahasiswa {
  public String nama;
  public String nim;
  
  //ciptakan konstruktor
  public Mahasiswa(){
	  nama = "Bima Adityo Kurniawan";
	  nim = "H1A018048";
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
