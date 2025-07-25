/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temporizador;

import Tiempo.Tiempo;
import Tiempo.Configurable;
import Tiempo.Controlable;



/**
 *
 * @author rodol
 */
public class Temporizador extends Tiempo implements Configurable, Controlable {
    
    @Override
    public void configurar (int h, int m, int s){
        this.hora=h;
        this.minuto=m;
        this.segundo=s;
    }
    
    @Override
    public void iniciar(){
        this.activo = true;
    }
    
    @Override
    public void detener(){
        this.activo = false;
    }
    
    @Override
    public void correr(){
        if(this.activo){
            segundo--;
            if (segundo == -1) {
                segundo = 59;
                minuto--;
                if (minuto == -1) {
                    minuto = 59;
                    hora--;
                    if (hora == -1) {
                        hora = 0;
                        minuto = 0;
                        segundo = 0;
                        this.activo = false;
                    }
                }
            }
        }
    }
}
