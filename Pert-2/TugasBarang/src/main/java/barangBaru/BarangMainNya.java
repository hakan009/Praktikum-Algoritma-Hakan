/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barangBaru;

/**
 *
 * @author USER
 */
public class BarangMainNya {
    public static void main(String[] args){
        BarangNya b1 = new BarangNya();
        b1.nama = "SATA HDD";
        b1.hargaSatuan = 300000;
        b1.jumlah = 65;
        int hargaTotal;
        int diskon;
        int hargaBayar;
        b1.hitungHargaTotal();
        b1.hitungDiskon();
        hargaBayar = b1.hitungHargaBayar();
        System.out.println("Barang: " + b1.nama);
        System.out.println("Harga: " + b1.hargaSatuan);
        System.out.println("Jumlah: " + b1.jumlah);
        System.out.println("Total bayarnya adalah: " + hargaBayar);
    }
}

