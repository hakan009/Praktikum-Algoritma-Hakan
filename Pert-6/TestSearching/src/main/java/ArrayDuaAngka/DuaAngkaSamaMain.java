/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayDuaAngka;

/**
 *
 * @author USER
 */
public class DuaAngkaSamaMain {
    public static void main(String[] args) {
        int bil[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        
        DuaAngkaSama angka = new DuaAngkaSama(bil);
        
        int jumlah = 10;
        int max = 0;
        
        System.out.println("===============================");
        System.out.println("Data awal");
        angka.tampil();
        System.out.println();
        System.out.println("===============================");
        System.out.println("Setelah sorting");
        angka.BubbleSort();
        angka.tampil();
        angka.CariNilaiTerbesar();
        angka.BinarySearch(max, 0, jumlah - 1);
        angka.TampilPosisi(max);
    }
}
