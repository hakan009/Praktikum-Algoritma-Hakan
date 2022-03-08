/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanah;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class tanahMain {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah tanah: ");
        int x = sc.nextInt();
        
        tanahJB[] tn = new tanahJB[x];
        
        for(int i = 0; i < tn.length; i++){
            tn[i] = new tanahJB();
            System.out.println("Tanah ke-" + (i+1));
            System.out.print("Panjang tanah: ");
            tn[i].panjang = sc.nextInt();
            System.out.print("Lebar tanah: ");
            tn[i].lebar = sc.nextInt();
        }
        System.out.println();
        for(int i = 0; i < tn.length; i++ ){
            System.out.println("Luas tanah ke-" + (i+1)+ ": " + tn[i].luasTanah());
        }
        System.out.println();
        int temp = 0;
        int l[]= new int[x];
        for(int i = 0; i < l.length; i++){
            l[i] = tn[i].luasTanah();
        }
        temp = tn[0].terluas(l);
        System.out.println("Tanah terluas: tanah ke-" +(temp + 1));
    }
}
