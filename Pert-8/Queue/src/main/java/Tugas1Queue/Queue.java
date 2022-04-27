/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1Queue;
/**
 *
 * @author USER
 */
public class Queue {
    int data [];
    int front;
    int rear;
    int size;
    int max;
    
    public Queue(int n){
        max = n;
        data = new int[max];
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
            System.out.println("Elemen terdepan: " + data[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekPosition(int data){
        if(!isEmpty()){
            for(int i = 0; i < max; i++){
                if(this.data[i] == data){
                    System.out.println("Data " + data + " ditemukan di indeks ke-" + i);
                } 
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekAt(int position){
        if(!isEmpty()){
            System.out.println("Data di indeks ke-" + position + " adalah " + data[position]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen: " + size);
        }
    }
    
    public void clear(){
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void enqueue(int dt){
        if(isFull()){
            System.out.println("Queue sudah penuh");
            System.exit(0);
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
            data[rear] = dt;
            size++;
        }
    }
    
    public int dequeue(){
        int dt = 0;
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
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
        return dt;
    }
}
