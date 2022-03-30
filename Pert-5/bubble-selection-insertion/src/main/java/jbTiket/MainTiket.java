/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbTiket;

/**
 *
 * @author USER
 */
public class MainTiket {
    public static void main(String[] args) {
        TiketServis list = new TiketServis();
        Tiket m1 = new Tiket("Bulwark of the Weak", 1000000, "Surabaya", "Malang");
        Tiket m2 = new Tiket("King of Nothing", 1100000, "Jakarta", "Yogyakarta");
        Tiket m3 = new Tiket("Diviner of the Deep", 1200000, "Semarang", "Bali");
        Tiket m4 = new Tiket("Titanic Goldweaver", 1300000, "Surakarta", "Medan");
        Tiket m5 = new Tiket("Survivor of Planet", 950000, "Surabaya", "Jakarta");
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data Tiket: ");
        System.out.println("=============================");
        list.tampilAll();
        
        System.out.println();
        System.out.println("=============================");
        System.out.println("Data Tiket setelah bubblesort: ");
        System.out.println("=============================");
        list.bubblesort();
        list.tampilAll();
        
        System.out.println();
        System.out.println("=============================");
        System.out.println("Data Tiket setelah selectionsort: ");
        System.out.println("=============================");
        list.selectionsort();
        list.tampilAll();
    }
}
