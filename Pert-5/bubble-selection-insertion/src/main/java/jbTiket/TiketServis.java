/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbTiket;

/**
 *
 * @author USER
 */
public class TiketServis {
    Tiket tket[] = new Tiket[5];
    int tikets;
    
    void tambah(Tiket t){
        if(tikets < tket.length){
            tket[tikets] = t;
            tikets++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampilAll(){
        for(Tiket t : tket){
            t.tampil();
            System.out.println("==============");
        }
    }
    
    void bubblesort(){
        for(int i=0; i< tket.length-1; i++){
            for(int j=1; j<tket.length-i; j++){
                if(tket[j].harga > tket[j-1].harga){
                    Tiket tmp = tket[j];
                    tket[j] = tket[j-1];
                    tket[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionsort(){
        for(int i = 0; i < tket.length-1; i++){
            int idxMin = i;
            for(int j = i + 1; j < tket.length; j++){
                if(tket[j].harga < tket[idxMin].harga){
                    idxMin = j;
                }
            }

            Tiket tmp = tket[idxMin];
            tket[idxMin] = tket[i];
            tket[i] = tmp;
        }
                    
    }

}
