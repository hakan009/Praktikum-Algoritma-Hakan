import java.util.Arrays;  
public class tugas04 {
	public static void tampilArray(int[][]arr){
		for (int i = 0; i < arr.length; i++){
			System.out.println();
			System.out.println("Royal Garden ke-" + (i + 1) + ":");
			for(int j =0; j < arr[0].length; j++){	
				System.out.print( arr[i][j]+ " ");
			}
		}
	}
	
	public static int stockBunga(){
		int[][] bunga = {{10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}};
		int aglonema = 0;
		int keladi =0;
		int alocasia = 0;
		int mawar =0;
		aglonema = bunga[0][0] + bunga[1][0] + bunga[2][0] + bunga[3][0]; 
		keladi = bunga[0][1] + bunga[1][1] + bunga[2][1] + bunga[3][1]; 
		alocasia = bunga[0][2] + bunga[1][2] + bunga[2][2] + bunga[3][2]; 
		mawar = bunga[0][3] + bunga[1][3] + bunga[2][3] + bunga[3][3];
		System.out.println("B. Jumlah Stok Bunga Pada Semua Cabang"); 
		System.out.println(" Aglonema :" + aglonema); 
		System.out.println(" Keladi :" + keladi); 
		System.out.println(" Alocasia :" + alocasia); 
		System.out.println(" Mawar :" + mawar);
		return aglonema+keladi+alocasia+mawar;
	}
	
    public static void main(String[] args) {
	int[][] bunga = {{10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}};
	int bungaBos=-1;
	System.out.println("A. Stock bunga tabel");
	tampilArray(bunga);
	System.out.println();
	System.out.println();
	bungaBos=stockBunga();
	}
}