/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Move;
/**
 *
 * @author USER
 */
public class Pacman {
    int x,y,width,height;

    void moveLeft(){
        if(x<0 && x>width){
            System.out.print("X lebih kecil dari 0 atau lebih besar dari lebar");
        }else {
            System.out.println("Bergerak ke-kiri");
            width=x-1;
        }
    }
    void moveRight(){
        if(x<0 && x>width){
            System.out.print("X lebih kecil dari 0 atau lebih besar dari lebar");
        }else {
            System.out.println("Bergerak ke-kanan");
            width=x+1;
        }
    }
    void moveUp(){
        if(y<0 && y>height){
            System.out.print("Y lebih kecil dari 0 atau lebih besar dari tinggi");
        }else {
            System.out.println("Bergerak ke-atas");
            height=y+1;
        }
    }
    void moveDown(){
        if(y<0 && y>height){
            System.out.print("Y lebih kecil dari 0 atau lebih besar dari tinggi");
        }else {
            System.out.println("Bergerak ke-bawah");
            height=y-1;
        }
    }
    void printPosition(){
        System.out.println("Koordinat X = " + x);
        System.out.println("Koordinat Y = " + y);
    }
}
