/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1Stack;
/**
 *
 * @author USER
 */
public class Stack {
    int size;
    int top;
    Pakaian data[];
    
    public Stack(int size){
        this.size = size;
        data = new Pakaian[size];
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
    
    public void push(Pakaian pkn){
        if(!isFull()){
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi Stack penuh");
        }
    }
    
    public void pop(){
        if(!isEmpty()){
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga) ;
    }
    
    public void print(){
        System.out.println("Isi stack: ");
        for(int i = top; i >= 0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
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
    public void getMin(){
        double minElm = data[0].harga;
        int minIndex = 0;
        for(int i = top; i >= 0; i--){
            if(data[i].harga < minElm){
                minElm = data[i].harga;
                minIndex = i;
            }
        }
        System.out.println(data[minIndex].jenis + " " + data[minIndex].warna + " " + data[minIndex].merk + " " + data[minIndex].ukuran + " " + data[minIndex].harga);
    }
    }

