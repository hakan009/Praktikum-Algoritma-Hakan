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
import java.util.*;

class Graph<T>{

	private Map<T, List<T> > map = new HashMap<>();

	public void addVertex(T s){
	
		map.put(s, new LinkedList<T>());
	}

	public void addEdge(T source, T destination, boolean bidirectional){					
		if (!map.containsKey(source)){
			addVertex(source);
                }

		if (!map.containsKey(destination)){
			addVertex(destination);
                }

		map.get(source).add(destination);
		if (bidirectional == true) {
			map.get(destination).add(source);
		}
	}

	public void getVertexCount(){
		System.out.println("Graph punya: " + map.keySet().size()+ " vertex");
	}

	public void getEdgesCount(boolean bidirection){
		int count = 0;
		for (T v : map.keySet()) {
			count += map.get(v).size();
		}
		if (bidirection == true) {
			count = count / 2;
		}
		System.out.println("Graph punya: "+ count + " edges.");
	}

	public void hasVertex(T s){
		if (map.containsKey(s)) {
			System.out.println("Graph punya: "+ s + " untuk vertex.");
		}
		else {
			System.out.println("Graph tidak punya: " + s + " untuk vertex.");
		}
	}

	public void hasEdge(T s, T d){
		if (map.get(s).contains(d)) {
			System.out.println("Graph punya edges diantara: " + s + " dan " + d + ".");
		}
		else {
			System.out.println("Graph punya edges diantara: " + s + " dan " + d + ".");
		}
	}

	@Override
	public String toString(){
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
