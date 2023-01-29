
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josa1
 */
public class BFSVertex {
    private String name;
    private boolean visited;
    private List<BFSVertex> adjacencyList;
    
    public BFSVertex(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visted) {
        this.visited = visted;
    }

    public List<BFSVertex> getAdjacencyList() {
        return adjacencyList;
    }

    public void addNeighbor(BFSVertex vertex) {
        this.adjacencyList.add(vertex);
    }
    
    
    
    
    
}
