/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SumMain {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Program menghitung keuntungan total (Satuan juta, misal 5.9)");
        System.out.print("Masukkan banyak perusahaan: ");
        int per = sc.nextInt();
        Sum[] sm = new Sum[per];
        
        for(int i=0; i<sm.length; i++ ){
            System.out.print("Masukkan jumlah bulan untuk perusahan ke-" + (i+1) + ": " );
            int elm = sc.nextInt();
            sm[i] = new Sum(elm);
            for(int j=0; j<sm[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke-" +(j+1) + " = ");
                sm[i].keuntungan[j]= sc.nextDouble(); 
            }
            System.out.println("===================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));
            System.out.println("===================================");
            System.out.println("Algoritma Divide & Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));
        }
    }
}