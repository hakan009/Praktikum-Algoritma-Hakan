/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

/**
 *
 * @author USER
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa[] listmhs = new Mahasiswa[5];
    int idx;
    
    //method tambah
    void tambah(Mahasiswa m){
        if(idx < listmhs.length){
            listmhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    
    //method tampil
    void tampil(){
        for(Mahasiswa m : listmhs){
            m.tampil();
            System.out.println("==============");
        }
    }
    
    //method bubblesort (descending sorting(besar --> kecil))
    void bubblesort(){
        for(int i=0; i< listmhs.length-1; i++){
            for(int j=1; j<listmhs.length-i; j++){
                if(listmhs[j].ipk > listmhs[j-1].ipk){
                    //proses swap
                    Mahasiswa tmp = listmhs[j];
                    listmhs[j] = listmhs[j-1];
                    listmhs[j-1] = tmp;
                }
            }
        }
    }
    
    //method selection sort(ascending sorting(besar --> kecil))
    void selectionsort(){
        for(int i = 0; i < listmhs.length-1; i++){
            int idxMin = i;
            for(int j = i + 1; j < listmhs.length; j++){
                if(listmhs[j].ipk < listmhs[idxMin].ipk){
                    idxMin = j;
                }
            }

            Mahasiswa tmp = listmhs[idxMin];
            listmhs[idxMin] = listmhs[i];
            listmhs[i] = tmp;
        }
                    
    }
    
    //method insertion sort(ascending)
    void insertionsort(){
        for(int i = 1; i < listmhs.length; i++){
            Mahasiswa temp = listmhs[i];
            int j = i; 
            while(j>0 && listmhs[j-1].ipk > temp.ipk){
                listmhs[j] = listmhs[j-1];
                j--;
            }
            listmhs[j] = temp;
        }
    }
    
    //method insertion sort(descending)
    void insertionsortdesc(){
        for(int i = 1; i < listmhs.length; i++){
            Mahasiswa temp = listmhs[i];
            int j = i; 
            while(j>0 && listmhs[j-1].ipk < temp.ipk){
                listmhs[j] = listmhs[j-1];
                j--;
            }
            listmhs[j] = temp;
        }
    }

}
    

