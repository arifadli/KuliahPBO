package models;

public class MPerson {
   public static void main (String[] args){
	  Person person1, person2; 
	  
	  person1 = new Person();
	  person1.nama = "Bima Adityo Kurniawan";
	  person1.noiden = 12345;
	  
	 System.out.println("Nama: "+ person1.nama); 
	 System.out.println("NIM:"+ person1.noiden);
	 
	 //Menggunakan Accessor
	 person2 = new Person();
	 
	 person2.setnama("Kurniawan Adityo Bima");
	 person2.setnoiden(54321);
	 
	 System.out.println(person2.getnama());
	 System.out.println(person2.getnoiden());
	
   }
}
