import java.util.Scanner;
public class tugas06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		double s;
		double v;
		double t;
		System.out.println("1. Cari Kecepatan (v)");
		System.out.println("2. Cari Jarak (s)");
		System.out.println("3. Cari Waktu (t)");
		System.out.print("\nMasukkan angka: ");
		menu = sc.nextInt();
		switch(menu){
			case 1:
				System.out.print("Masukkan Jarak: ");
				s = sc.nextInt();
				System.out.print("Masukkan Waktu: ");
				t = sc.nextInt();
				v = s/t;
				System.out.print("Kecepatannya adalah: " +v);
				break;
			case 2:
				System.out.print("Masukkan Kecepatan: ");
				v = sc.nextInt();
				System.out.print("Masukkan Waktu: ");
				t = sc.nextInt();
				s = v*t;
				System.out.print("Jaraknya adalah: " + s);
				break;
			case 3:
				System.out.print("Masukkan Jarak: " );
				s = sc.nextInt();
				System.out.println("Masukkan Kecepatan: ");
				v = sc.nextInt();
				t = s/v;
				System.out.print("Waktunya adalah: " +t);
				break;
			default:
				System.out.print("Mohon memasukkan angka dari 1-3");
		}
	}
}