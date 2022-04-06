/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;
        
        System.out.println("===================================");
        System.out.println("Masukkan urut data Mahasiswa dari NIM terkecil");
        for(int i = 0; i <jumMhs; i++){
            System.out.println("============");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
            
            System.out.println("===============================");
            System.out.println("Data keseluruhan Mahasiswa");
            data.tampil();
            
            //System.out.println("===============================");
            //System.out.println("Data mahasiswa sesudah disorting: ");
            //data.bubblesort();
            //data.tampil();
            
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("Pencarian data: ");
            System.out.println("Masukkan NIM mahasiswa yang dicari ");
            System.out.print("NIM: ");
            int cari = s.nextInt();
           // System.out.println("Masukkan Nama mahasiswa yang dicari ");
            //System.out.print("Nama: ");
            //String cari = sl.nextLine();
            System.out.println("Menggunakan Sequential Search");
            int posisi = data.FindSeqSearch(cari);
            //int posisi = data.FindSeqSearchNama(cari);
            
            data.TampilPosisi(cari, posisi);
            data.TampilData(cari,posisi);
            
            //System.out.println("===============================");
            //System.out.println("Menggunakan Binary Search");
            //int posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
            
            //data.TampilPosisi(cari, posisi);
            //data.TampilData(cari,posisi);
    }
}
