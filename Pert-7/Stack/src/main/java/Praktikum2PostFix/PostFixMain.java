/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2PostFix;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class PostFixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P;
        String Q;
        
        System.out.println("Masukkan ekspresi matematika(infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        
        PostFix post = new PostFix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
