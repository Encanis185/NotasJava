/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shortest.path;

/**
 *
 * @author Josa1
 */
public class Edge {
    private Vertex target;
    private int weight;
    
    public Edge(Vertex target, int weight){
        this.target = target;
        this.weight = weight;
    }

    public Vertex getTarget() {
        return target;
    }

    public int getWeight() {
        return weight;
    }
  
}
