import java.util.Scanner;
public class tugas05 {
    public static void main(String[] args) {
		int harga =4500;
		int ani= 4;
		int budi= 15;
		int bina= 6;
		int cita= 11;
		int total =0;
		
		System.out.println("Pakaian di atas 10 Kg mendapat diskon 5%");
		System.out.println("Budi dan Cita mendapat diskon 5%");
		System.out.println();
			
		int hargaBudi = (budi*harga)*5 /100;
		int hargaBudi1= (budi*harga) - hargaBudi;
		int hargaCita= (cita*harga)*5/100;
		int hargaCita1=(cita*harga) - hargaCita;
		
		total = (ani*harga) + (bina*harga) + hargaBudi1 + hargaCita1;
		System.out.print("Totalnya adalah: Rp." +total);
	}
}