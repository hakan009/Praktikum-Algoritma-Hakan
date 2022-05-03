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
public class nodestack {
    String data;
    nodestack next;
    
    public nodestack(String nilai, nodestack lanjut){
        this.data = nilai;
        this.next = lanjut;
    }

}
