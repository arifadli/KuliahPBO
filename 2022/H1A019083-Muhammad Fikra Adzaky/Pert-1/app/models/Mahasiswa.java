package models;

public class Mahasiswa {
	public String nama;
	public int nim;
	public Mahasiswa() {
		nama = "M Fikra Adzaky";
		nim = 19083;
	}
	public String getnama() {
		return nama;
	}
	public int getnim() {
		return nim;
	}
	public void setnama(String namanya) {
		nama = namanya;
	}
	public void setnim(int nimnya) {
		nim = nimnya;
	}
}
