/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latprak45;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class PerguruanTinggiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("PEMILIHAN KETUA BEM KOTA MALANG");
        System.out.println("=======================================================");
        System.out.print("Masukkan banyak kandidat: ");
        int banyakKandidat = in.nextInt();
        PerguruanTinggi[] bem = new PerguruanTinggi[banyakKandidat];
        
        for(int i=0; i<bem.length; i++ ){
        System.out.print("Masukkan nama kandadidat ke-" + (i+1)+ ": ");
        String kandit = sc.nextLine();
        System.out.print("Masukkan jumlah voter kandidat ke-" + (i+1) + ": " );
        int voter = in.nextInt();
        bem[i] = new PerguruanTinggi(voter,kandit);
            for(int j=0; j<bem[i].vote; j++){
                    System.out.print("Masukkan jumlah voting kandidat ke-" +(j+1) + " = ");
                    bem[i].jumlahVoting[j]= sc.nextInt(); 
                    sc.nextLine();
            }
            System.out.println("===================================");
            System.out.println("Kandidat " + bem[i].kandidat + " adalah = " + bem[i].hasilVoting(bem[i].jumlahVoting, 0, bem[i].vote-1));
        }
        
    }
}
