
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
public class Vertex {
    private String name;
    private List<Vertex> adjacencyList;
    
    public Vertex(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }
    
    public void addNeighbor(Vertex vertex){
        adjacencyList.add(vertex);
    }
    
    public void showNeighbors(){
        for(Vertex v: adjacencyList){
            System.out.println(v);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
