/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BFS {
    //Contiene las urls
    private Queue<String> queue;
    private List<String> discoveredWebsiteList;
    
    public BFS(){
        this.queue = new LinkedList<>();
        this.discoveredWebsiteList = new ArrayList<>();
    }
    
    //Iniciaremos en www.bbc.com
    public void discoverWeb(String root){
        this.queue.add(root);
        this.discoveredWebsiteList.add(root);
        
        while(!queue.isEmpty()){
            String v = this.queue.remove();
            String rawHtml = readURL(v);
            
            //expresion regular para encontrar sitios web
            String regexp = "https://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);
            
            while(matcher.find()){
                String w = matcher.group();
                
                if(!discoveredWebsiteList.contains(w)){
                    discoveredWebsiteList.add(w);
                    System.out.println("Sitio encontrado: " + w);
                    
                    queue.add(w);
                }
            }
        }
    }
    //Leer el contenido html de un sitio web (v)
    //Regresa el contenido en un formato de String
    private String readURL(String v){
        StringBuilder rawHtml = new StringBuilder("");
        
        try{
            URL url = new URL(v);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String line ="";
            while((line = reader.readLine()) != null){
                rawHtml.append(line);
            }
        } catch(Exception e){
            System.out.println("Problema al intentar leer el sitio web");
        }
        return rawHtml.toString();
    }
}
