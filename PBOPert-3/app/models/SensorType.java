package models;

public class SensorType extends SensorManager{
	public int price, jumlah, input, output;
	public String type;
	
	public int addnode(int jml){
	 int jumlah=jml;
	 return jumlah;	
	}
	
	@Override
	public void addsensor(){
		type = "suhu";
	}
	
	public void setprice(){
		price = 100;
	}
	
	public int getprice(){
		return price;
	}

	@Override
	public int addnode() {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
