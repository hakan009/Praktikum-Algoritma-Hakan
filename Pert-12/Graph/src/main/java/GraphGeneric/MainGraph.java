/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphGeneric;

/**
 *
 * @author USER
 */
public class MainGraph {
    public static void main(String args[]){
		Graph<Integer> g = new Graph<Integer>();

		g.addEdge(1, 2, true);
		g.addEdge(0, 4, true);
		g.addEdge(1, 2, true);
		g.addEdge(1, 3, true);
		g.addEdge(1, 4, true);
		g.addEdge(2, 3, true);
		g.addEdge(3, 4, true);

		System.out.println("Graph:\n" + g.toString());

		g.getVertexCount();

		g.getEdgesCount(true);

		g.hasEdge(3, 4);

		g.hasVertex(5);
	}
}
