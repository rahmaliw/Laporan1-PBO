package laporan1;

public class biodata {
	static String nama = "Rahma Liwanty";/* deklarasi variabel, string disini sebagai variabel global 
	yang dapat digunakan disemua class*/
	
	public static void main(String args[])
	{
		System.out.println(nama); //println untuk menampilkan sekaligus pindah baris, nama pemanggilan variabel yg telah dideklarasikan di variabel global
		System.out.println("Nim 60200112020");//println untuk menampilkan sekaligus pindah baris
		System.out.println("Kelas A");
		System.out.print("Semester ");
		System.out.println(bagi(12,2));//println untuk menampilkan sekaligus pindah baris
		System.out.println("Jurusan Teknik Informatika");//println untuk menampilkan sekaligus pindah baris
		System.out.print("Angkatan ");
		System.out.println(kurang(2015,3));//println untuk menampilkan sekaligus pindah baris
		System.out.println("Asal Makassar");//println untuk menampilkan sekaligus pindah baris
		System.out.println("Lahir di Ujung Pandang, 25 September 1994");//println untuk menampilkan sekaligus pindah baris
		System.out.print(jumlah(2,1));
		System.out.println(" Bersaudara");//println untuk menampilkan sekaligus pindah baris
		System.out.print("Berumur ");
		System.out.print(kali(4,5));
		System.out.println(" Tahun");//println untuk menampilkan sekaligus pindah baris
		
	}
	
	static int jumlah(int a, int b){ 
		return a+b; //return sebagai pengembalian nilai
	}
	
	static int kurang(int a, int b){
		return a-b;
	}
	
	static int kali(int a, int b){
		return a*b;
	}
	
	static float bagi(int a, int b){
		return a/b;
	}
}	
