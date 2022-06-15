/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapharray;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class graphArrayMain  {
    public static void main(String[] args)throws Exception {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        graphArray graph;
        try{
            System.out.println("Masukkan jumlah vertices: ");
            v = sc.nextInt();
            System.out.println("Masukkan jumlah edge: ");
            e = sc.nextInt();
            
            graph = new graphArray(v);
            
            System.out.println("Masukkan edges: <to> <from>");
            while(count <= e){
                to = sc.nextInt();
                from = sc.nextInt();
                
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph: ");
            System.out.println(" ");
            for(int i = 1; i <= v; i++){
                System.out.print(i + " ");
            }
            System.out.println();
            
            for(int i = 1; i <= v; i++){
                System.out.print(i + " ");
                for(int j = 1; j <= v; j++){
                    System.out.print(graph.getEdge(i, j) + " ");
                }
                System.out.println();
            }
        } catch (Exception E){
            System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close();
    }
}
