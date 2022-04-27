/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2Queue;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class QueueMain {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Data Mahasiswa baru");
        System.out.println("2. Data Mahasiswa keluar");
        System.out.println("3. Cek data mahasiswa terdepan");
        System.out.println("4. Cek data mahasiswa paling belakang");
        System.out.println("5. Cek semua antrian");
        System.out.println("6. Cari penempatan mahasiswa berdasar NIM");
        System.out.println("7. Cari mahasiswa dengan indeks");
        System.out.println("==============");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        
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
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = s.nextInt();
                    System.out.print("IPK: ");
                    double ipk = s.nextDouble();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                    antri.enqueue(mhs);
                    break;
                
                case 2:
                    Mahasiswa data = antri.dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0 && data.ipk !=
                            0) {
                        System.out.println("Antrian yang keluar: " + data.nim + " " + data.nama + " " + data.absen + " " 
                        + data.ipk);
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
                    
                case 6:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimmhs = sc.nextLine();
                    antri.peekPosition(nimmhs);
                    break;
                    
                case 7:
                    System.out.print("Masukkan indeks yang dicari: ");
                    int indeks = s.nextInt();
                    antri.printMahasiswa(indeks);
                    break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
