
package models;

public class MMahasiswa {
   public static void main (String[] args){
	  Mahasiswa mahasiswa1, mahasiswa2; 
	  
	  mahasiswa1 = new Mahasiswa();
	  mahasiswa1.nama = "Muhammad Hendrick Sedayu";
	  mahasiswa1.nim = "H1A019060";
	  
	 System.out.println("Nama: "+ mahasiswa1.nama); 
	 System.out.println("NIM:"+ mahasiswa1.nim);
	 
	 
	 //Menggunakan Accessor
	 mahasiswa2 = new Mahasiswa();
	 
	 mahasiswa2.setnama("Muhammad Hendrick Sedayu");
	 mahasiswa2.setnim("H1A019060");
	 
	 System.out.println(mahasiswa2.getnama());
	 System.out.println(mahasiswa2.getnim());
	
   }
}