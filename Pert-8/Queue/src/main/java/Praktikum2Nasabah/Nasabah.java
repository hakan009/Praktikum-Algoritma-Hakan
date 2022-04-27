/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2Nasabah;

/**
 *
 * @author USER
 */
public class Nasabah {
    String norek;
    String nama;
    String alamat;
    int umur;
    double saldo;
    
    public Nasabah(String norek, String nama, String alamat, int umur, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
    
    Nasabah(){
        
    }
 }
