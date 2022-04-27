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
public class Queue {
    Mahasiswa antrian[];
    int front;
    int rear;
    int size;
    int max;
    
    public Queue(int n){
        max = n;
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean isEmpty(){
        if(size == 0){
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean isFull(){
        if(size == max){
            return true;
        } else {
            return false;
        }
    }
    
    public void peek(){
        if(!isEmpty()){
            System.out.println("Elemen terdepan: " + antrian[front].nim + " " + antrian[front].nama + " " + antrian[front].absen + " " 
            + antrian[front].ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekRear(){
        if(!isEmpty()){
            System.out.println("Elemen terdepan: " + antrian[rear].nim + " " + antrian[rear].nama + " " + antrian[rear].absen + " " 
            + antrian[rear].ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " 
            + antrian[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " 
            + antrian[i].ipk);
            System.out.println("Jumlah elemen: " + size);
        }
    }
    
    public void peekPosition(String nimm){
        if(!isEmpty()){
            for(int i = 0; i < max; i++){
                if(antrian[i].nim.equals(nimm)){
                    System.out.println("Mahasiswa dengan NIM  " + nimm + " ditemukan di indeks ke-" + i);
                } 
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void printMahasiswa(int position){
        if(!isEmpty()){
            System.out.println("Mahasiswa pada indeks ke-" + position + " adalah " + antrian[position].nama);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void enqueue(Mahasiswa antri){
        if(isFull()){
            System.out.println("Queue sudah penuh");
        } else { 
            if(isEmpty()){
                front = rear = 0;
            } else {
                if (rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }
    
    public Mahasiswa dequeue(){
        Mahasiswa antri = new Mahasiswa();
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            antri = antrian[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            } else {
                if(front == max - 1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return antri;
    }
}
