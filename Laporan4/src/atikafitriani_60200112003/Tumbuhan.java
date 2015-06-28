package atikafitriani_60200112003;

public class Tumbuhan {
	private String namaSpesies;
	private int lebarDaun;
	
	private void Tumbuhan() {
		namaSpesies = "sayur";
		lebarDaun = 30;
	}
	private void Tumbuhan (String nama, int lebar){
		namaSpesies = nama;
		lebarDaun = lebar;
	}
	
	public void cetakTumbuhan() {
		System.out.println(namaSpesies + lebarDaun);
	}
	
	public static void main (String args []) {
		Tumbuhan tumbuhan = new Tumbuhan ();
		tumbuhan.cetakTumbuhan();
		tumbuhan = new Tumbuhan ();
		tumbuhan.cetakTumbuhan();
	
	}

}



