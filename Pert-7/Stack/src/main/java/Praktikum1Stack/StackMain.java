/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1Stack;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        
        char pilih;
    
    while(true){    
        System.out.println("===============================");
        System.out.println("         Cari Pakaian          ");
        System.out.println("===============================");
        System.out.println("1.Masukkan pakaian(push)");
        System.out.println("2.Ambil pakaian(pop)");
        System.out.println("3.Lihat pakaian teratas(peek)");
        System.out.println("4.Print list pakaian(print)");
        System.out.println("5.Hapus data pakaian(clear)");
        System.out.println("6.Cari Harga Terkecil(getMin)");
        System.out.println("7.Keluar");
        System.out.print("Masukkan pilihan: ");
        int pilihan = s.nextInt();
        if(pilihan == 1){
            do{
                System.out.print("Jenis: ");
                String jenis = sc.nextLine();
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                System.out.print("Merk: ");
                String merk = sc.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = sc.nextLine();
                System.out.print("Harga: ");
                double harga = sc.nextDouble();
            
                Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                System.out.print("Apakah anda menambahkan data baru ke stack (y/n): ");
                pilih = sc.next().charAt(0);
                System.out.println("================");
                sc.nextLine();
                stk.push(p);
            } while (pilih == 'y');
        }else if(pilihan == 2){
            stk.pop();
        } else if(pilihan == 3){
            stk.peek();
        } else if (pilihan == 4){
            stk.print();
        } else if (pilihan == 5){
            stk.clear();
        } else if (pilihan == 6){
            stk.getMin();
        } else if (pilihan == 7) {
            System.exit(0);
        } else {
            System.out.println("Masukkan pilihan 1-7");
        }
  
    }
    }
}
