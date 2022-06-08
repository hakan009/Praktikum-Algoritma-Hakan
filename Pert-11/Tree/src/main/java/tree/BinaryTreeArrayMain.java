/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
       // int[] data = {6,4,8,3,5,7,9,0,0,0};
       // int idxLast = 6;
       // bta.populateData(data, idxLast);
       // bta.traverseInOrder(0);
       
        System.out.println("Masukkan banyak data: ");
        int atad = sc.nextInt();
        int data[] = new int[atad];
        
        for(int i = 0; i < data.length; i++){
            System.out.println("Masukkan nilai ke-" + (i+1));
            int nilai = sc.nextInt();
            bta.addData(nilai, i);
            bta.add(data);
        }
        
        System.out.println("============");
        System.out.println("Pilih nilai sebagai root: ");
        int idxLast = sc.nextInt();
        bta.populateData(data, idxLast);
        System.out.println("PreOrder: ");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println("Inorder: ");
        bta.traverseInOrder(0);
        System.out.println();
        System.out.println("PostOrder: ");
        bta.traversePreOrder(0);
    }    
}
