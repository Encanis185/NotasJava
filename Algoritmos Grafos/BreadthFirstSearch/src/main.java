/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josa1
 */
public class main {
    
    public static void main(String[] args) {
        BFS breadthFirstSearch = new BFS();
   
    BFSVertex a = new BFSVertex("A");
    BFSVertex b = new BFSVertex("B");
    BFSVertex c = new BFSVertex("C");
    BFSVertex d = new BFSVertex("D");
    BFSVertex e = new BFSVertex("E");
    BFSVertex f = new BFSVertex("F");
    BFSVertex g = new BFSVertex("G");
    BFSVertex h = new BFSVertex("H");
    
    a.addNeighbor(b);
    a.addNeighbor(f);
    a.addNeighbor(g);
    
    b.addNeighbor(a);
    b.addNeighbor(c);
    b.addNeighbor(d);
    
    c.addNeighbor(b);
    
    d.addNeighbor(b);
    d.addNeighbor(e);
    
    f.addNeighbor(a);
    
    a.addNeighbor(a);
    a.addNeighbor(h);
    
    a.addNeighbor(g);
    
    breadthFirstSearch.traverse(a);
    }
    
}
