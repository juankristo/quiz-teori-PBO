//Juan kristo 51019014

import java.util.Scanner;

public class quizteori{
	
	public static void main (String args[]){
	
		Scanner input = new Scanner(System.in);
		
		String nama;
		int tiperumah, biayabeban = 0 , jumlahmeteran, bayar, totalharga, kembalian;
		
		System.out.print("Masukkan Nama anda : ");
		nama = input.nextLine();
		System.out.print("Masukkan Tipe Rumah anda : ");
		tiperumah = input.nextInt();
		System.out.print("Masukkan Jumlah Meteran Pemakaian Rumah anda : ");
		jumlahmeteran = input.nextInt();
		System.out.println();
		System.out.println();
		
	 
	 
	 switch (tiperumah) {
	 	case 31 : 
	 		biayabeban = 100000;
	 		break;
	 	case 32 : 
	 		biayabeban = 125000;
	 		break;
	 	case 33 : 
	 		biayabeban = 450000;
	 		break;
	 	case 34 : 
	 		biayabeban = 480000;
	 		break;
	 	case 35 : 
	 		biayabeban = 500000;
	 		break;
	 	case 40 : 
	 		biayabeban = 550000;
	 		break;
	 	default : System.out.println("Tipe Rumah Yang Anda Masukkan Salah");
	 		break;
	 }
	
	
	totalharga= (jumlahmeteran*biayabeban);
	
	
	System.out.println("Total Harga anda : " + totalharga);
	
	
	
	System.out.print("Masukkan Jumlah Uang Pembayaran : ");
	bayar = input.nextInt();
	System.out.println();
	System.out.println();
	kembalian = (bayar-totalharga);
	
	System.out.println("Nama anda : " + nama);
	System.out.println("Total Harga anda : " + totalharga);
	System.out.println("Pembayaran anda : " + bayar);
	System.out.println("Kembalian anda: " + kembalian);
	
			
	}	
	
}

	