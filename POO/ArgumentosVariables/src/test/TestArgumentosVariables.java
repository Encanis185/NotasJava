/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Josa1
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirArgumentos(1,2,3,4,5,6,7,8,9,10);
        
        argumentosVariados("HolaMundo", 1,2,3);
    }
    
    private static void argumentosVariados(String cadena, int... v){
        System.out.println("Cadena: " + cadena);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Valor: " + v[i]);
            
        }
       
    }
    
    
    private static void imprimirArgumentos(int... numeros){
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }
}
