/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2Queue;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    String nim;
    String nama;
    int absen;
    double ipk;
    
    public Mahasiswa(String nim, String nama, int absen, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }
    
    public Mahasiswa(){
        
    }
}
