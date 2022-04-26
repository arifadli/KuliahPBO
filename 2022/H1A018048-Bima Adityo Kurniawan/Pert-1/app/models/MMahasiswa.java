package models;

public class MMahasiswa {
   public static void main (String[] args){
	  Mahasiswa mahasiswa1, mahasiswa2; 
	  
	  mahasiswa1 = new Mahasiswa();
	  mahasiswa1.nama = "Bima Adityo Kurniawan";
	  mahasiswa1.nim = "H1A018048";
	  
	 System.out.println("Nama: "+ mahasiswa1.nama); 
	 System.out.println("NIM:"+ mahasiswa1.nim);
	 
	 
	 //Menggunakan Accessor
	 mahasiswa2 = new Mahasiswa();
	 
	 mahasiswa2.setnama("Kurniawan Adityo Bima");
	 mahasiswa2.setnim("H1A018048");
	 
	 System.out.println(mahasiswa2.getnama());
	 System.out.println(mahasiswa2.getnim());
	
   }
}
