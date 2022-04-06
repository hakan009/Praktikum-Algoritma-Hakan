/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayDuaAngka;

/**
 *
 * @author USER
 */
public class DuaAngkaSama {
    int bilangan[];
    int max;
    int posisi;
    int jumlah;

    DuaAngkaSama(int nilai[]) {
        bilangan = nilai;
    }

    void tampil() {
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i] + " ");
        }
    }

    void BubbleSort() {
        for (int i = 0; i < bilangan.length - 1; i++) {
            for (int j = 1; j < bilangan.length - i; j++) {
                if (bilangan[j] > bilangan[j - 1]) {
                    int tmp = bilangan[j];
                    bilangan[j] = bilangan[j - 1];
                    bilangan[j - 1] = tmp;
                }
            }
        }
    }

    public int BinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left+right)/2;
            if (cari == bilangan[mid]){
                return (mid);
            } else if (bilangan[mid] > cari){
                return BinarySearch(cari,left,mid-1);
            } else {
                return BinarySearch(cari,mid+1,right);
            }
        }
        return -1;
    }

    public int CariNilaiTerbesar() {
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] > max) {
                max = bilangan[i];
            }
        }
        System.out.println();
        System.out.println("Nilai yang paling besar adalah : " + max);
        return max;
    }

    public void TampilPosisi(int posisi) {
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == max) {
                jumlah++;
            }
        }
        System.out.print("Jumlahnya: " + jumlah);
        System.out.println();
        posisi = max;
        for (int i = 0; i < bilangan.length; i++) {
            if (posisi == bilangan[i]) {
                this.posisi = i;
                System.out.println("Data ditemukan pada indeks ke-" + this.posisi);
            }
        }
    }
}
