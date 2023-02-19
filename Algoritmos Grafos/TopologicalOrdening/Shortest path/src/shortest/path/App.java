/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shortest.path;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josa1
 */
public class App {
    public static void main(String[] args) {
        List<Vertex> graph = new ArrayList<>();
        
        Vertex v0 = new Vertex("S");
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        
        v0.setNeighbor(new Edge(v1,1));
        v0.setNeighbor(new Edge(v3,2));
        
        v1.setNeighbor(new Edge(v2,6));
        
        v2.setNeighbor(new Edge(v4,1));
        v2.setNeighbor(new Edge(v5,2));
        
        v3.setNeighbor(new Edge(v1,4));
        v3.setNeighbor(new Edge(v4,3));
        
        v4.setNeighbor(new Edge(v5,1));
        
        
        graph.add(v0);
        graph.add(v1);
        graph.add(v2);
        graph.add(v3);
        graph.add(v4);
        graph.add(v5);
        
        ShortestPath algorithm = new ShortestPath(graph);
        algorithm.compute();
        
        for(Vertex v: graph){
            System.out.println("Distancia desde el origen S: " + v.getMinDistance() 
                    + " - "+ v.getPredecessor());
            System.out.println(v.toString());
            
        }
        
    }
}
