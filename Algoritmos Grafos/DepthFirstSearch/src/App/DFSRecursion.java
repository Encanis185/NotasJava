/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.List;
import java.util.Stack;

/**
 * Es uno de los algoritmos mas utilizados junto a BFS
 * Explora todo lo posible en cada rama antes de volver (BFS lo hace "nivel por nivel")
 * Time complexity O(V+E)
 * Memory complexity: Un poco mejor que BFS
 * 
 * Hay 2 maneras de implementarlo: Con recursion o iteracion( usando stack)
 * 
 * APLICACIONES
 * Ordenamiento topologico
 * Encontrar componentes fuertemente conectados
 * Detectar ciclos
 * Encontrar la salida de un laberinto o generar un laberinto
 * 
 */
public class DFSRecursion {
   
    
    public void dfs(List<Vertex> vertexList){
        //Podemos tener muchos grafos independientes
        for(Vertex v: vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }
    
    private void dfsHelper(Vertex vertex){
        System.out.println("Vertice visitado: "+ vertex);
        
        for(Vertex v: vertex.getNeighbors()){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }
}
