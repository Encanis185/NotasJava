/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.ArrayList;
import java.util.List;


public class Vertex {
    private String name;
    private boolean visited;
    private List<Vertex> adjacencyList;
    
    public Vertex(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }
    
    public void addNeighbor(Vertex v){
        adjacencyList.add(v);
    }
    
    public List<Vertex> getNeighbors(){
        return adjacencyList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Vertex> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }
    
    @Override
    public String toString() {
        return name;
    }
   
}
