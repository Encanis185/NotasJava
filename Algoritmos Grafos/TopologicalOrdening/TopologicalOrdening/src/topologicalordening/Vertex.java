/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topologicalordening;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name; //Algo para identificar el nodo
    private boolean visited = false;
    private List<Vertex> neighborList;
    
    public Vertex(String name){
        this.name = name;
        this.neighborList = new ArrayList<>();
    }
    
    public void addNeighbor(Vertex vertex){
        this.neighborList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    @Override
    public String toString() {
        return "Vertex {" + "name=" + name + '}';
    }

    
    
}
