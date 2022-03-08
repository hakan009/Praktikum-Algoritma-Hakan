/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanah;

/**
 *
 * @author USER
 */
public class tanahJB {
    public int panjang;
    public int lebar;
    
    public int luasTanah(){
        return panjang * lebar;
    }
    
    public int terluas(int l[]){
        int palingLuas = 0;
        int temp = 0;
        for(int i = 0; i < l.length; i++){
            if(l[i] > palingLuas){
                palingLuas = l[i];
                temp = i;
            }
        }
        return temp;
    }
}
