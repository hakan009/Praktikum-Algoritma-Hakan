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
// Java program to implement Graph
// with the help of Generics

import java.util.*;

class Graph<T> {

	// We use Hashmap to store the edges in the graph
	private Map<T, List<T> > map = new HashMap<>();

	// This function adds a new vertex to the graph
	public void addVertex(T s)
	{
		map.put(s, new LinkedList<T>());
	}

	// This function adds the edge
	// between source to destination
	public void addEdge(T source,
						T destination,
						boolean bidirectional)
	{

		if (!map.containsKey(source))
			addVertex(source);

		if (!map.containsKey(destination))
			addVertex(destination);

		map.get(source).add(destination);
		if (bidirectional == true) {
			map.get(destination).add(source);
		}
	}

	// This function gives the count of vertices
	public void getVertexCount()
	{
		System.out.println("Graph punya: "
						+ map.keySet().size()
						+ " vertex");
	}

	// This function gives the count of edges
	public void getEdgesCount(boolean bidirection)
	{
		int count = 0;
		for (T v : map.keySet()) {
			count += map.get(v).size();
		}
		if (bidirection == true) {
			count = count / 2;
		}
		System.out.println("Graph punya: "
						+ count
						+ " edges.");
	}

	// This function gives whether
	// a vertex is present or not.
	public void hasVertex(T s)
	{
		if (map.containsKey(s)) {
			System.out.println("Graph punya: "
							+ s + " untuk vertex.");
		}
		else {
			System.out.println("Graph tidak punya: "
							+ s + " untuk vertex.");
		}
	}

	// This function gives whether an edge is present or not.
	public void hasEdge(T s, T d)
	{
		if (map.get(s).contains(d)) {
			System.out.println("Graph punya edges diantara: "
							+ s + " dan " + d + ".");
		}
		else {
			System.out.println("Graph punya edges diantara: "
							+ s + " dan " + d + ".");
		}
	}

	// Prints the adjancency list of each vertex.
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();

		for (T v : map.keySet()) {
			builder.append(v.toString() + ": ");
			for (T w : map.get(v)) {
				builder.append(w.toString() + " ");
			}
			builder.append("\n");
		}

		return (builder.toString());
	}
}
