
import java.util.LinkedList;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Cuando queremos visitar cada nodo usamos BFS
 * Visitar solamente una vez
 * Complejidad de ejecucion: O(V+E)
 * El uso de memoria no es bueno: Almacena muchas referencias
 * DFS-Depth First Search es preferido por esta razon
 * Su ventaja es que construye el camino más corto.
 * Dijkstra usa BFS cuando todo las aristas tienen un peso de 1
 * 
 * La estructura principal es una cola
 * Tenemos una cola vacia y tenemos que revisar si ya hemos visitado un nodo o no
 * El algoritmo hace iteraciones hasta que la cola no este vacia
 * 
 * APLICACIONES
 * En machine learning, los robots pueden aprender de su entorno mas facil con BFS comparado con DFS
 * Flujo maximo:El algoritmo Edmonds-Karp usa BFS
 * El Algoritmo Cheyen para la recoleccion de basura: Mantiene referencias activas en la memoria heap
 * Serializacion y desereizalizacion de arboles. 
 * Permite reconstruir arboles de manera eficiente
 */
public class BFS {
    public void traverse(BFSVertex root){
        Queue<BFSVertex> queue = new LinkedList<>();
        
        root.setVisited(true);
        queue.add(root);
        
        while(!queue.isEmpty()){
            BFSVertex actualVertex = queue.remove();
            System.out.println("Vertice actual visitado: " + actualVertex);
            
            for(BFSVertex v: actualVertex.getAdjacencyList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
