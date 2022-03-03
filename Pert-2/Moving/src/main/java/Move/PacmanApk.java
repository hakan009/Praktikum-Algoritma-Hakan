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
public class PacmanApk {
    public static void main(String[] args) {
        Pacman b1= new Pacman();
        b1.x=6;
        b1.y=7;
        b1.height=12;
        b1.width=14;
        System.out.println("Titik koordinat sebelum bergerak");
        System.out.println("Tinggi = "+b1.height);
        System.out.println("Lebar = "+b1.width);
        b1.printPosition();
        b1.moveUp();
        b1.printPosition();
        b1.moveDown();
        b1.printPosition();
        b1.moveLeft();
        b1.printPosition();
        b1.moveRight();
        b1.printPosition();
        System.out.println("Titik koordinat sesudah bergerak");
        System.out.println("Tinggi = "+b1.height);
        System.out.println("Lebar = "+b1.width);
    }
}
