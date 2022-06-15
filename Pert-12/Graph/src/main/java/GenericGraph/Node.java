/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericGraph;

/**
 *
 * @author USER
 */
public class Node<T> {
    T data;
    Node<T> prev, next;
    
    Node(Node<T> prev, T data, Node<T> next){
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
