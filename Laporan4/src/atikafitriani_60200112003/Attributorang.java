package atikafitriani_60200112003;

public class Attributorang {
	public String nama;
	public String alamat;
	public int tinggibadan;
	public float beratbadan;
	
	public void cetakorang () {
		System.out.println(nama);
		System.out.println(alamat);
		System.out.println(tinggibadan);
		System.out.println(beratbadan);
		
	}
	public static void main(String []args) {
		Attributorang objekorang = new Attributorang();
		objekorang.nama = "atika";
		objekorang.alamat = "bone";
		objekorang.tinggibadan = 169;
		objekorang.beratbadan =40;
		objekorang.cetakorang();
		
		Attributorang objekorangdua = new Attributorang ();
		objekorangdua.nama = "af";
		objekorangdua.alamat = "bone";
		objekorangdua.tinggibadan = 146;
		objekorangdua.beratbadan =45;
		objekorangdua.cetakorang();
	}
}
