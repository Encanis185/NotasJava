/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webcrawler;

public class App {
    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.discoverWeb("https://www.bbc.com");
    }   
}
