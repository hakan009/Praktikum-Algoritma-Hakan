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
public class Kubus {
    public int sisi;
    
    public Kubus(int s){
        sisi = s;
    }
    
    public int vol(){
        return sisi * sisi * sisi;
    }
    
    public int luasPerm(){
        return 6 * (sisi * sisi);
    }
}
