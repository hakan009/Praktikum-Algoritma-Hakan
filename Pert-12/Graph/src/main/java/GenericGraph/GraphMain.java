/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericGraph;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class GraphMain {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //System.out.print("Masukkan banyak vertex: ");
        //int vertex = sc.nextInt();
        Graph graph = new Graph(6);   
        
        //System.out.print("Masukkan banyak edge: ");
        //int edge = sc.nextInt();
        
        //for(int i = 0; i < edge; i++){
        //    System.out.print("Masukkan Source: ");
        //    int source = sc.nextInt();
        //    System.out.print("Masukkan Destination: ");
        //    int destination = sc.nextInt();
         //   graph.addEdge(source, destination);
       // }        
       // graph.printGraph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 3);
        graph.printGraph();
    }
}
