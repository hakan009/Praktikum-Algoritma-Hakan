/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author USER
 */
public class Persegi {
    public int sisi;
    
    public Persegi(int s){
        sisi = s;
    }

    public static void main(String[] args){
        Persegi[] per = new Persegi[100];
        
        per[0] = new Persegi(s);
        per[0].sisi = 20;
        
        System.out.println(per[5].sisi);
    }
}
