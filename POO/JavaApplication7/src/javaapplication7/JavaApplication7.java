/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Josa1
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // int[] array = new int[5]; //inicializar array
        // Integer[] ar = new Integer[5]; //Entero per ocomo clase
        
        List<String> list = new ArrayList<>();
        
        list.add("2");
        list.add("1");
        list.add("5");
        list.add("7");
        
        list.stream().peek(s->System.out.println(s)).count(); //Un chorro de agua
        
        LinkedList<String> list2 = new LinkedList<>();
        
        list2.add("2");
        list2.add("1");
        list2.add("5");
        list2.add("7");
        list2.addFirst("6");
        list2.addLast("9");
        
        System.out.println(list2.peek());
        
        //list.stream().peek(s->System.out.println(s)).count(); //Un chorro de agua
    }
    
}
