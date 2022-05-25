/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasDLL;

/**
 *
 * @author USER
 */
public class node {
    String nama;
    int no;
    node prev,next;
    
    node(node prev, int no, String nama, node next){
        this.prev = prev;
        this.nama = nama;
        this.no = no;
        this.next = next;
    }
}
