/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author Josa1
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] map = {
        {1,1,1,1,1,1},
        {2,1,1,1,0,3},
        {0,0,0,0,0,1},
        {0,0,0,1,0,0},
        {0,0,0,1,1,0},
        {0,0,0,0,1,0}
        };
        
        MazeSolver ms = new MazeSolver(map,1,0);
        ms.findWay();
    
    }
    
}
