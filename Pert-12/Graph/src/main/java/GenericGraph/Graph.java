/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericGraph;

/**
 *
 * @author USER
 */
public class Graph<T> {
    Integer vertex;
    LinkedList list[];
    
    public Graph(Class<T> clazz, Integer vertex){
        this.vertex = vertex;
        list = (T[]) Array.newInstance(clazz, vertex);
        for(int i = 0; i < vertex; i++){
            list[i] = new LinkedList<>();
        }
    }
    

    
    public void addEdge(T source, T destination){
        //add edge
        list[source].addFirst(destination);
        
        //add back edge(undirected)
        list[destination].addFirst(source);
    }
    
    public boolean graphType(int source, int destination){
        list[source].addFirst(destination);
        return true;
    }
    
    public void degree(int source) throws Exception{
        //degree undirected graph
        System.out.println("Degree vertex" + source + list[source].size);
        
        //degree directed graph
            //indegree
        int k, totalIn = 0, totalOut= 0;
        for(int i = 0; i < vertex; i++){
            for(int j = 0; j < list[i].size(); j++){
                if(list[i].get(j) == source){
                    ++totalIn;
                }
            }   
            for(k = 0; k < list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("Degree vertex  " + source + " : " + (totalIn + totalOut));
    }
    
    public void removeEdge(int source, int destination) throws Exception{
        for(int i = 0; i < vertex; i++){
            if(i == source){
                list[source].remove(source);
            }
        }
    }
    
    public void removeAllEdge(){
        for(int i = 0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception{
        for(int i = 0; i < vertex; i++){
            if(list[i].size() > 0){
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for(int j = 0; j < list[i].size(); j++){
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        System.out.println("");
        }
    }
    
}
