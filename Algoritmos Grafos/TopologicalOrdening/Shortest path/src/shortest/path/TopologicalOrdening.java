package shortest.path;

import java.util.List;
import java.util.Stack;

public class TopologicalOrdening {

    private Stack<Vertex> stack;
    
    public TopologicalOrdening(List<Vertex> graph){
        this.stack = new Stack<>();
        
        for(int i = 0; i<graph.size(); i++){
            if(!graph.get(i).isVisited()){
                dfs(graph.get(i));
            }
        }
    }
    
    public void dfs(Vertex vertex){
        vertex.setVisited(true);
        
        //Considerar a todos los vecinos como DFS
        for(Edge e: vertex.getNeighbors()){
            if(!e.getTarget().isVisited()){
                dfs(e.getTarget());
            }
        stack.add(vertex);
        }
    }
    
    public Stack<Vertex> getStack(){
        return this.stack;
    }
    
}
