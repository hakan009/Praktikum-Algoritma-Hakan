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
        System.out.println("=======================================================");
        System.out.println("PEMILIHAN KETUA BEM KOTA MALANG");
        System.out.println("=======================================================");
        PergururanTinggi pol = new PergururanTinggi();
        PergururanTinggi[] bem = new PergururanTinggi[pol.kandidatBanyak];
        
        for(int i = 0; i < pol.kandidatBanyak; i++) {
            bem[i] = new PergururanTinggi();
            System.out.println("Nama Kandidat BEM ke- " + (i+1) + ": ");
            bem[i].kandidat = sc.nextLine();
        }
        for (int i = 0; i < pol.kandidatBanyak; i++) {
            System.out.println("Jumlah Pemilih Suara Kandidat BEM ke = " + (i+1) + ": ");
            bem[i].vote = sc.nextInt();
            pol.jumlahVoting += bem[i].vote;
        }
        System.out.println("=======================================================");
        int hasil_bem = pol.hitungHasil(pol.jumlahVoting, bem[0].vote, bem[1].vote, bem[2].vote, bem[3].vote);
        if(hasil_bem == 0) {
            System.out.println("Kandidat memiliki mayoritas hampir sama");
        }else{
            System.out.println("Ketua BEM Kota Malang Adalah " + bem[hasil_bem-1].kandidat);
        }
    }
}