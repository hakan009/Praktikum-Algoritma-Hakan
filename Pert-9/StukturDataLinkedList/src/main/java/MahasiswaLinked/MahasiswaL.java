/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MahasiswaLinked;

/**
 *
 * @author USER
 */
public class MahasiswaL {
    String nim;
    String nama;
    int absen;
    double ipk;
    MahasiswaL next;
    
    public MahasiswaL(String nim, String nama, int absen, double ipk, MahasiswaL lanjut){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
        this.next = lanjut;
    }    
}
