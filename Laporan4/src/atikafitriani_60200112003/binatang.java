package atikafitriani_60200112003;

public class binatang {
	public static int JUMLAH_HEWAN = 0;
	public String spesies;

	public static void tambahhewan (){
	JUMLAH_HEWAN++;
	}
public static void main (String args[]){
	binatang objekbinatang = new binatang();
	objekbinatang.spesies = "kucing";
	binatang.tambahhewan ();
	System.out.println(binatang.JUMLAH_HEWAN);
	
	binatang objekbinatangdua = new binatang();
	objekbinatang.spesies = "kucingaf";
	binatang.tambahhewan ();
	System.out.println(binatang.JUMLAH_HEWAN);
	
	System.out.println(objekbinatang.JUMLAH_HEWAN);
	System.out.println(objekbinatangdua.JUMLAH_HEWAN);
	
	}
}
