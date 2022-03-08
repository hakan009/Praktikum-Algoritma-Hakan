/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VolLuas;

/**
 *
 * @author USER
 */
public class Tabung {
    public int jari;
    public int tinggi;
    
    public Tabung (int j, int t){
        jari = j;
        tinggi = t;
    }
    
    public double vol(){
        return 3.14 * (jari*jari) * tinggi;
    }
    
    public double luasPerm(){
        return 2 * 3.14 * jari * (jari + tinggi);
    }
}
