/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 * @author USER
 */
public class mahasiswa {
    String nim;
    String nama;
    String noTelp;
    
    public mahasiswa(){
        
    }
    
    public mahasiswa(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim = " + nim + ",nama = " + nama + ", noTelp = " + noTelp + '}';
    }
}
