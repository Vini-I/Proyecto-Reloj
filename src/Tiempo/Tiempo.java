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
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public Tiempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
    public void restart(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
}
