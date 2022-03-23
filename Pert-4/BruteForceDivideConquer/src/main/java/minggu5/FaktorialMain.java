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
public class FaktorialMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.println("================================");
        System.out.print("Masukkan jumlah elemen yang diinginkan: ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for(int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
            System.out.println("================================");
            System.out.println("Hasil faktorial dengan brute force");
            long start = System.nanoTime();
            for(int i= 0; i < elemen; i++){
                System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah :" + fk[i].faktorialBF(fk[i].nilai));
            }
            long end = System.nanoTime();
            long eksekusi = (end-start);
            System.out.println(eksekusi + " nano detik");
            
            System.out.println("================================");
            System.out.println("Hasil faktorial dengan divide & conquer");
            start = System.nanoTime();
            for(int i= 0; i < elemen; i++){
                System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah :" + fk[i].faktorialDC(fk[i].nilai));
        }
            end = System.nanoTime();
            eksekusi = (end-start);
            System.out.println(eksekusi + " nano detik");
    }

}