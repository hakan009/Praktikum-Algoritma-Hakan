import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim;
		int n;
		String hari[]={"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu", };
		
		System.out.print("Masukkan NIM : ");
		nim= sc.nextLine();
		nim = nim.substring(nim.length()-2);
		try{
			int num = Integer.parseInt(nim);
			System.out.println(num);
			if(num<10){
			num +=10;
		}
		for (int i =1; i <=num; i++){
			n = i - 1;
			n = n%7;
			System.out.print(hari[n]+ " ");
		}
		}catch(NumberFormatException ex){
			System.out.println("Harap memasukkan angka");
		}
	}
}