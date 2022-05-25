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
public class nodeF {
    String judul, id;
    double rating;
    nodeF prev, next;
    
    nodeF(nodeF prev, String id, String judul, double rating, nodeF next){
        this.prev = prev;
        this.next = next;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
}
