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
public class Barang {
    String noTrans;
    String tgl;
    int jumBarang;
    int total;
    int size;
    int top;
    Barang [] data;
    
    Barang(String noTrans, String tgl, int jumBarang, int total){
        this.noTrans = noTrans;
        this.tgl = tgl;
        this.jumBarang = jumBarang;
        this.total = total;
    }
    
    public Barang(int size){
        this.size = size;
        data = new Barang[this.size];
        top = -1;
    }
    
    public boolean isEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull(){
        if(top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    
    public void push(Barang stck){
        if(!isFull()){
            top++;
            data[top] = stck;
        } else {
            System.out.println("Isi Stack penuh");
        }
    }
    
    public void pop(){
        if(!isEmpty()){
            Barang st = data[top];
            top--;
            System.out.println("Data yang keluar: ");
            System.out.println("No. Transaksi: " + st.noTrans);
            System.out.println("Tanggal Transaksi: " + st.tgl);
            System.out.println("Jumlah barang: " + st.jumBarang);
            System.out.println("Total harga: " + st.total);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas: ");
        System.out.println("No. Transaksi: " + data[top].noTrans);
        System.out.println("Tanggal Transaksi: " + data[top].tgl);
        System.out.println("Jumlah barang: " + data[top].jumBarang);
        System.out.println("Total harga: " + data[top].total);
    }
    
    public void print(){
        System.out.println("Isi stack: ");
        for(int i = top; i >= 0; i--){
            System.out.println("No. Transaksi: " + data[i].noTrans);
            System.out.println("Tanggal Transaksi: " + data[i].tgl);
            System.out.println("Jumlah barang: " + data[i].jumBarang);
            System.out.println("Total harga: " + data[i].total);
            System.out.println("=============================================");
    }
        System.out.println();
    }
        
    public void clear(){
        if(!isEmpty()){
            for(int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
