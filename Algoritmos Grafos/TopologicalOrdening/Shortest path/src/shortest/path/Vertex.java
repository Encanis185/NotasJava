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
public class Vertex {
    private String name;
    private boolean visited;
    //Distancia minima para cada vertice 
    private int minDistance;
    //Nodo anterior en el camino más corto
    private Vertex predecessor;
    private List<Edge> adjacencyList;
    
    public Vertex(String name){
        this.name = name;
        this.minDistance = Integer.MAX_VALUE;
        this.adjacencyList = new ArrayList<>();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getNeighbors() {
        return adjacencyList;
    }

    public void setNeighbor(Edge edge) {
        this.adjacencyList.add(edge);
    }

    
    
    @Override
    public String toString() {
        return name + " - " + predecessor;
    }
    
    
}
