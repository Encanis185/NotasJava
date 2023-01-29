/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Josa1
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Primer dia de la semana: " + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
        /* indicarDiaSemana("LUNES");  No permite ejecutarlo */
        
        
        System.out.println("Continente: " + Continentes.AMERICA);
        System.out.println("Cantidad de paises: " + Continentes.AMERICA.getCantidadPaises());
        System.out.println("Poblacion: " + Continentes.AMERICA.getPoblacion());
     
    }
    
    private static void indicarDiaSemana(Dias dia){
        switch(dia){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            default:
                System.out.println("No es un dia de la semana");
        }
    }
}
