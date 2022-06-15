/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author USER
 */
public class Node {
    int data;
    Node prev, next;
    
    Node(Node prev, int data, Node next){
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
