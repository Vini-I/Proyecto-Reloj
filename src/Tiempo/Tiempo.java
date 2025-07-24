/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiempo;

/**
 *
 * @author rodol
 */
public class Tiempo {
    private int contador;

    public int getContador(){
        return contador;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public Tiempo() {
        this.contador = 0;
    }
    
    public void restart(){
        this.contador = 0;
    }
    
}
