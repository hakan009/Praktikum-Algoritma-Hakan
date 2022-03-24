/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latprak45;

/**
 *
 * @author USER
 */
public class PerguruanTinggi {
    public int vote;
    public int jumlahVoting[];
    String kandidat;
        
    PerguruanTinggi(int voting, String kandidat){
        this.vote = voting;
        this.jumlahVoting = new int[voting];
        this.kandidat = kandidat;
    }
    
        
    int hitungVoting(int arr[], int l, int r, int major){
        int hitung =0;
        for(int i=l; i<=r; i++){
            if (arr[i] == major){
                hitung++;
            }
        }
        return hitung;
    }
    
    int hasilVoting(int arr[], int l, int r){
        if (l==r){
            return arr[l];
        }
        int mid = (r-l)/2 + l;
        int leftMajor = hasilVoting(arr, l, mid);
        int rightMajor = hasilVoting(arr, mid+1, r);
        
        if (leftMajor==rightMajor){
            return leftMajor;
        }
        int leftHitung = hitungVoting(arr, l, r, leftMajor);
        int rightHitung = hitungVoting(arr, l, r, rightMajor);
        
        return leftHitung > rightHitung ? leftMajor : rightMajor;
    }
}