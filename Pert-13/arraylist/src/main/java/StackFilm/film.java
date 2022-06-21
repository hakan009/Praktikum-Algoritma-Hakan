/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackFilm;

/**
 *
 * @author USER
 */
public class film {
    int id;
    String judul;
    int tahun;
    String director;
    
    public film(int id, String judul, int tahun, String director){
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }

    public film(){
        
    }        
}
