/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Josa1
 */
public class MazeSolver {
    private int[][] maze;
    private boolean[][] visited;
    private int startRow;
    private int startCol;
    
    public MazeSolver(int[][] maze, int startRow,int startCol){
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length]; //Tenemos una matriz de booleanos
        this.startRow = startRow;
        this.startCol = startCol;
    }
    
    public void findWay(){
        if(dfs(startRow,startCol))
            System.out.println("Existe la solucion!!!");
        else
            System.out.println("No existe la solucion :c");  
    }
    
    private boolean isFeasible(int x, int y){
        if(x<0 || x>maze.length-1) //Horizontal
            return false;
        
        if(y<0 || y>maze.length-1) //Vertical
            return false;
        
        if(visited[x][y]) //No podemos revisitar
            return false;
        
        if(maze[x][y] == 1) //Hay un obstaculo
            return false;
        
        return true;  //Se puede visitar
    }
    
    
    private boolean dfs(int x,int y){
        //Caso base
        if(x == maze.length-1 && y == maze.length-1)
            return true;
        
        if(isFeasible(x,y)){
            visited[x][y] = true;
            
            //Movernos
            if(dfs(x+1,y))
                return true;
            if(dfs(x-1,y))
                return true;
            if(dfs(x,y+1))
                return true;
            if(dfs(x,y-1))
                return true;
            
            //Patras :c
            visited[x][y]=false;
            return false;
        }
        
        return false;
    }
}
