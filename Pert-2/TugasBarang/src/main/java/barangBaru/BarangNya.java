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
public class BarangNya {
    String nama;
    int hargaSatuan, jumlah;
    int hargaTotal, diskon;

 int hitungHargaTotal(){
    hargaTotal = hargaSatuan * jumlah;
    return hargaTotal;
}

int hitungDiskon(){
    if(hargaTotal > 100000){
        diskon = hargaTotal * 10/100;
    }else if (hargaTotal >= 50000 && hargaTotal <= 100000){
        diskon = hargaTotal * 5 / 100;
    }else{
        diskon = 0;
    }
return diskon;
}

int hitungHargaBayar(){
    return hargaTotal - diskon;
}
}
