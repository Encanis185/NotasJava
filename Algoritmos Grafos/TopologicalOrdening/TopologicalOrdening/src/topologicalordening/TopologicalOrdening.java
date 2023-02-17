package topologicalordening;

import java.util.Stack;

public class TopologicalOrdening {

    private Stack<Vertex> stack;
    
    public TopologicalOrdening(){
        this.stack = new Stack<>();
    }
    
    public void dfs(Vertex vertex){
        vertex.setVisited(true);
        
        //Considerar a todos los vecinos como DFS
        for(Vertex v: vertex.getNeighborList()){
            if(!v.isVisited()){
                dfs(v);
            }
        stack.push(vertex);
        }
    }
    
    public Stack<Vertex> getStack(){
        return this.stack;
    }
    
}
