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
public class mainstacknode {
    public static void main(String[] args) {
        nodestacklink nd = new nodestacklink();
        
        nd.print();
        nd.push("Bahasa");
        nd.print();
        nd.push("Android");
        nd.print();
        nd.push("Komputer");
        nd.print();
        nd.push("Basis Data");
        nd.print();
        nd.push("Matematika");
        nd.print();
        nd.push("Algoritma");
        nd.print();
        nd.push("Statistika");
        nd.print();
        nd.push("Multimedia");
        nd.print();
        nd.peek();
        
    }
}
