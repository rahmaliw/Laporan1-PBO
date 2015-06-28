package Atikafitriani;

public class Bitwise {
	public static void main (String [] args){
		byte angka1 = 106;
		byte angka2 = -66;
		System.out.println(~angka1);
		System.out.println(~angka2);
		
		System.out.println(~angka1 & 5);
		System.out.println(~angka1 | 5);
		System.out.println(~angka1 ^ 5);
		System.out.println(~angka1>>2);
		System.out.println(~angka2>>5);
		System.out.println(~angka1<<3);
		System.out.println(~angka1>>>3);
		System.out.println(~angka1>>>5);
		
	}

}
