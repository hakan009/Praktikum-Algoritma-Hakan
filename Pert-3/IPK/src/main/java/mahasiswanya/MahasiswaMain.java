/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswanya;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MahasiswaMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Banyak mahasiswa: ");
        int mhs = sc.nextInt();
        Mahasiswa[] mhss = new Mahasiswa[mhs];
        
        for(int i =0; i < mhss.length; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            sc.nextLine();
            System.out.print("Nama mahasiswa: ");
            String na = sc.nextLine();
            System.out.print("NIM mahasiswa: ");
            String ni = sc.nextLine();
            System.out.print("Jenis kelamin mahasiswa: ");
            String k = sc.nextLine();
            System.out.print("IPK mahasiswa: ");
            double ip = sc.nextDouble();
            mhss[i] = new Mahasiswa(na, ni, k, ip);
        }
        System.out.println();
        for(int i =0 ; i < mhss.length; i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("Nama: " + mhss[i].nama);
            System.out.println("NIM: " + mhss[i].nim);
            System.out.println("Jenis kelamin: " +mhss[i].kelamin);
            System.out.println("IPK: " + mhss[i].ipk);
        }
    }
}
