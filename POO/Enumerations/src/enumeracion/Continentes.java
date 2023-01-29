/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracion;

/**
 *
 * @author Josa1
 */
public enum Continentes {
    AFRICA(53, "1310 millones"),
    EUROPA(46, "747 millones"),
    ASIA(44, "4504 millones"),
    AMERICA(34, "1014 millones"),
    OCEANIA(14, "42 millones");
    
    private final int cantidadPaises;
    private final String poblacion;
    
    Continentes(int cantidadPaises, String poblacion){
        this.cantidadPaises = cantidadPaises;
        this.poblacion = poblacion;
    }
    
    public int getCantidadPaises(){
        return this.cantidadPaises;
    }
    
    public String getPoblacion(){
        return this.poblacion;
    }
}
