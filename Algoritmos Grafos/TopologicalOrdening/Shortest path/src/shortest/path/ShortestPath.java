/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shortest.path;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author Josa1
 */
public class ShortestPath {

    /**
     * @param args the command line arguments
     */
    private TopologicalOrdening to;
    
    
    public ShortestPath(List<Vertex> graph){
        this.to = new TopologicalOrdening(graph);
        graph.get(0).setMinDistance(0);
    }
    
    public void compute(){
        Stack<Vertex> order = to.getStack();
        
        while(!order.isEmpty()){
            Vertex u = order.pop();
            
            for(Edge e: u.getNeighbors()){
                Vertex v = e.getTarget();
                
                if((v.getMinDistance() > u.getMinDistance()+ e.getWeight())){
                    v.setMinDistance(u.getMinDistance()+ e.getWeight());
                    v.setPredecessor(u);
                }
            }
        }
    }
}
