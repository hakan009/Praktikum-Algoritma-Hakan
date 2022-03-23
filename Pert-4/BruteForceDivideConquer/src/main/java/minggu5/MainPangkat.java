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
public class MainPangkat {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Pilih Menu ");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide & Conquer");
        System.out.print(": ");
        int menu = sc.nextInt();
        if(menu > 2 || menu < 1){
            System.out.println("Tidak ada menu dengan no."+menu+ " akan menggunakan keduanya");
        }
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        
        Pangkat[] png = new Pangkat[elemen];
        
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai yang dipangkatkan ke-" + (i+1) + ": ");
           int  nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i+1)+ ": ");
            int pangkat = sc.nextInt();
            png[i]= new Pangkat(nilai,pangkat);
        }
           
        if(menu==1){
            System.out.println("================================");
            System.out.println("Hasil pangkat dengan Brute Force");
            for(int i = 0; i < elemen; i++){
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
        }else if(menu==2){
            System.out.println("================================");
            System.out.println("Hasil pangkat dengan Divide & Conquer");
            for(int i = 0; i < elemen; i++){
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
        }
        System.out.println("================================");
    }
}

                                