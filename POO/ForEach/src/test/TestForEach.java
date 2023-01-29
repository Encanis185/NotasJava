/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 * Nos facilita recorrer arreglos y colecciones
 * El inconveniente es que no podemos acceder al indice de lo que estamos recorriendo
 * 
 * @author Josa1
 */
public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {20, 18, 23, 15, 33, 27};
        
        for(int edad: edades){
            System.out.println("Edad: " + edad);
        }
        
        Persona personas[] = {new Persona("Josafat"), new Persona("Frida"), new Persona("Marisa")};
        
        for(Persona persona: personas){
            System.out.println(persona);
        }
    }
}
