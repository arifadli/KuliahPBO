package models;

public class M_Mahasiswa {
	public static void main (String[] args) {
		Mahasiswa mhs1, mhs2;
		
		mhs1 = new Mahasiswa();
		mhs1.nama = "M Fikra Adzaky";
		mhs1.nim = 19083;
		
		mhs2 = new Mahasiswa();
		mhs2.nama = "Ismail bin Mail";
		mhs2.nim = 19000;
		
		System.out.println("Nama : " + mhs1.nama);
		System.out.println("NIM : " + mhs1.nim);
		System.out.println("Nama : " + mhs2.nama);
		System.out.println("NIM : " + mhs2.nim);
	}
}