/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2Belanja;
/**
 *
 * @author USER
 */
public class StrukBarang {
    public static void main(String[] args) {        
        Barang brg = new Barang(8);
        Barang [] Barang = new Barang[8];
        
        Barang[0] = new Barang("123", "12-12-2012", 30, 150000);
        Barang[1] = new Barang("124", "21-12-2012", 12, 83000);
        Barang[2] = new Barang("125", "01-01-2013", 15, 90000);
        Barang[3] = new Barang("126", "13-01-2013", 22, 113000);
        Barang[4] = new Barang("127", "28-01-2013", 43, 230000);
        Barang[5] = new Barang("128", "14-02-2013", 9, 43000);
        Barang[6] = new Barang("129", "22-02-2013", 33, 167000);
        Barang[7] = new Barang("130", "06-03-2013", 18, 100000);
        
        for(int i = 0; i < brg.size; i++){
            brg.push(Barang[i]);
        }
        brg.print();
        System.out.println("======================");
        System.out.println("5 Struk");
        System.out.println("======================");
        for(int i = 0; i < 5; i++){
            brg.pop();
            System.out.println("======================");
            System.out.println();
            System.out.println("======================");
            if(i < 5){
                System.out.println((i+1) + " Struk ditukarkan " + (i+1) + " Voucher");
            }
        }
        System.out.println("Sisa Struk: ");
        brg.print();
    }
}
