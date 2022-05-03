/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackNode;

/**
 *
 * @author USER
 */
public class nodestacklink {
    nodestack top;  
    
    public boolean isEmpty(){
        return top == null;
    }

    public void push(String input){
        nodestack temp = new nodestack(input, null);
        if(isEmpty()){ 
            top = temp; 
        } else {
            temp.next = top;
            top = temp;
        }
    }
    
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack kosong");
            return;
        } 
        top = top.next;
        }
    
    public void peek(){
        if(!isEmpty()){
            nodestack temp = top;
            System.out.println("Stack teratas = " + top.data);
        }else{
            System.out.println("Stack kosong");
        }
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("Stack kosong");
        } else { 
            nodestack temp = top;
            while(temp != null){
                System.out.println(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
}
