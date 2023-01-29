/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Dos tipos de bloques de inicializacion de codigo
 * ESTATICOS  (se inician antes incluso de los NO ESTATICOS) static
 * Dentro de estos bloques no se puede usar el operador "this"
 * Variables no estaticas no pueden ser referenciadas en bloques static
 * Se ejecuta solo la primera vez que se carga en memoria la clase
 * 
 * NO ESTATICOS
 * Se ejecuta cada vez que se crea un objeto de la clase
 * 
 * Ambos se ejecutan antes del constructor de la clase
 * @author Josa1
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        System.out.println("Bloque de inicializacion estatico");
        ++Persona.contadorPersonas;
        /*idPersona = 10; Variables no estaticas no pueden ser referenciadas en bloques static */
        
    }
    
    /*Bloque no estatico*/
    {
        System.out.println("Bloque de inicializacion no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
