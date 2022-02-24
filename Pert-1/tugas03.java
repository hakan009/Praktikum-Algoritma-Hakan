import java.util.Scanner;
public class tugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int aglonema = 0;
		int keladi =0;
		int alocasia = 0;
		int mawar =0;
		int hrgAglo =75000;
		int hrgKeladi = 50000;
		int hrgAloc = 60000;
		int hrgMawar = 10000;
		int[][] bunga = {{10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}};

		 aglonema = bunga[0][0] + bunga[1][0] + bunga[2][0] + bunga[3][0]; 
		 keladi = bunga[0][1] + bunga[1][1] + bunga[2][1] + bunga[3][1]; 
		 alocasia = bunga[0][2] + bunga[1][2] + bunga[2][2] + bunga[3][2]; 
		mawar = bunga[0][3] + bunga[1][3] + bunga[2][3] + bunga[3][3]; 
		System.out.println("A. Jumlah Stok Bunga Pada Semua Cabang"); 
		System.out.println(" Aglonema :" + aglonema); 
		System.out.println(" Keladi :" + keladi); 
		System.out.println(" Alocasia :" + alocasia); 
		System.out.println(" Mawar :" + mawar); 
		
		bunga [0][0] = 9;
		bunga [0][0] = 3;
		bunga [0][0] = 15;
		bunga [0][0] = 2;
		int dapat = (bunga[0][0] * 75000) + (bunga[0][1] * 50000) + (bunga[0][2] * 60000) + (bunga[0][3] * 10000);
 
		System.out.println("B. Total Pendapatan : " + dapat);
	}
}