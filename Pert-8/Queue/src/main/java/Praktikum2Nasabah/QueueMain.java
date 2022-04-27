/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2Nasabah;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class QueueMain {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian paling belakang");
        System.out.println("5. Cek semua antrian");
        System.out.println("==============");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas Queue: ");
        int jumlah = sc.nextInt();
        
        Queue antri = new Queue(jumlah);
        
        int pilih;
        
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("No rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.enqueue(nb);
                    break;
                
                case 2:
                    Nasabah data = antri.dequeue();
                    if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo !=
                            0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " 
                        + data.umur + " " + data.saldo);
                        break;
                    }
                
                case 3:
                    antri.peek();
                    break;
                
                case 4:
                    antri.peekRear();
                    break;
                    
                case 5:
                    antri.print();
                    break;
            }
        }while (pilih == 1 | pilih == 2 || pilih == 3 | pilih == 4);
    }
}
