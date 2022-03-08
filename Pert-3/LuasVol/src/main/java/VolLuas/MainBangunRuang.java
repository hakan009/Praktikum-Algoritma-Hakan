/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VolLuas;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MainBangunRuang {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int s;
        Kubus [] kb = new Kubus[1];
        for(int i = 0; i <kb.length; i++ ){
            System.out.print("Masukkan sisi kubus: ");
            s = sc.nextInt();
            kb [i] = new Kubus(s);
        }
        System.out.println();
        
        int p, l, t;
        Balok [] bl = new Balok[1];
        for(int j = 0; j< bl.length; j++){
            System.out.print("Masukkan panjang balok: ");
            p = sc.nextInt();
            System.out.print("Masukkan luas balok: ");
            l = sc.nextInt();
            System.out.print("Masukkan tinggi balok: ");
            t = sc.nextInt();
            bl [j] = new Balok(p,l,t);
        }
        System.out.println();
        
        int j;
        Tabung [] tb = new Tabung[1];
        for(int k =0; k<tb.length; k++){
            System.out.print("Masukkan jari-jari tabung: ");
            j = sc.nextInt();
            System.out.print("Masukkan tinggi tabung: ");
            t = sc.nextInt();
            tb [k] = new Tabung(j,t);
        }
        System.out.println();
        System.out.print("================");
        
        for(int x = 0; x < kb.length; x++){
            System.out.println();
            System.out.println("Sisi kubus: " + kb[x].sisi);
            System.out.println("Volume kubus: " + kb[x].vol());
            System.out.println("Luas Permukaan kubus: " + kb[x].luasPerm());
        }
        
        for(int y = 0; y < bl.length; y++){
            System.out.println();
            System.out.println("Panjang balok: " + bl[y].panjang);
            System.out.println("Lebar balok: " + bl[y].lebar);
            System.out.println("Tinggi balok: " + bl[y].tinggi);
            System.out.println("Volume kubus: " + bl[y].vol());
            System.out.println("Luas Permukaan kubus: " + bl[y].luasPerm());
        }
        
        for(int z = 0; z < tb.length; z++){
            System.out.println();
            System.out.println("Jari-Jari tabung: " + tb[z].jari);
            System.out.println("Tinggi tabung: " + tb[z].tinggi);
            System.out.println("Volume tabung: " + tb[z].vol());
            System.out.println("Luas Permukaan tabung: " + tb[z].luasPerm());
        }
    }
}
