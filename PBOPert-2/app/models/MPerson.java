package models;

public class MPerson {
   public static void main (String[] args){
	  // ini perubahan sedikit
	  Person person1, person2; 
	  
	  person1 = new Person();
	  person1.nama = "Ari Fadli";
	  
	 System.out.println("nama: "+ person1.nama); 
	 
	 person2 = new Person();
	 
	 person2.setnama("Haris Prasetyo");
	 person2.setnoiden(67890);
	 
	 System.out.println(person2.getnama());
	 System.out.println(person2.getnoiden());
	
	 
   }
}
