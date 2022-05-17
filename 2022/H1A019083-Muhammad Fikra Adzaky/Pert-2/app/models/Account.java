package models;

public class Account extends Person {
	private double balance;
	
	//constructor
	public Account() {
		nama="none";
		noiden=0;
		balance= 0.0;
	}
	
	//overloading constructor
	public Account(String name, int no, double bal) {
		nama= name;
		noiden= no;
		balance= bal;
	}

  public void add(double amt){
	  balance = balance + amt;
  }
 
  public void deduct(double amt){
	  balance = balance - amt;
  }
  
  public double getCurrentBalance() {
	  return balance;
  }
  
  public void setInitialBalance (double bal) {
	  balance = bal;
  }
  
  public void setOwner(Person person) {
	  nama = person.getnama();
	  noiden = person.getnoiden();
  }
}