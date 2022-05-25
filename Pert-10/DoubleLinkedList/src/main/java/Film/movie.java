/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Film;

/**
 *
 * @author USER
 */
public class movie {
    nodeF head;
    int size;
    
    public movie(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(String id, String judul, double rating){
        if(isEmpty()){
            head = new nodeF(null, id, judul, rating, null);
        } else {
            nodeF newNode = new nodeF(null, id, judul, rating, null);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(String id, String judul, double rating){
        if(isEmpty()){
            addFirst(id, judul, rating);
        } else {
            nodeF current = head;
            while(current.next != null){
                current = current.next;
            }
            nodeF newNode = new nodeF(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(String id, String judul, double rating, int index) throws Exception {
        if(isEmpty()){
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai index film diluar batas");
        } else {
            nodeF current = head;
            int i = 0;
            while (i < index) { 
                current = current.next;
                i++;
            }
            if(current.prev == null){
                nodeF newNode = new nodeF(null, id, judul, rating, current);
                current.prev = newNode;
                head = newNode;
            } else {
                nodeF newNode = new nodeF(current.prev, id, judul, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if(!isEmpty()){
            nodeF tmp = head;
            while (tmp != null){
                System.out.println("ID: "+ tmp.id);
                System.out.println(" Judul Film: " + tmp.judul);
                System.out.println(" Rating Film: " + tmp.rating);
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("Sisa Film: " + size);
        } else {
            System.out.println("Linked list film kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list film masih kosong, tidak dapat dihapus");
        }else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list film masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        } 
        nodeF current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void remove(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks film diluar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            nodeF current = head;
            int i =0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }
    
    public void sorting(){
        nodeF current = null, index = null;
        double tmp;
        if(head == null){
            return;
        } else {
             for(current = head; current.next != null; current = current.next){
                 for(index = current.next; index != null; index = index.next) {
                     if(current.rating > index.rating) {  
                        tmp = current.rating;  
                        current.rating = index.rating;  
                        index.rating = tmp; 
                 }
             }
        }
    }
    }
    
    public void searching(String cari) {  
        int i = 0;  
        boolean flag = false;  
        nodeF current = head;  
  
        if(head == null) {  
            System.out.println("List film kosong");  
            return;  
        }  
        while(current != null) {  
            if(current.id.equalsIgnoreCase(cari)) {  
                flag = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(flag){  
             System.out.println("ID: " + cari + " ditemukan di indeks ke-" + i);  
        }else{  
             System.out.println("Film tidak ada di list");
        }
    }  
}
