
package trab2.lab1;

import java.util.Random;


public class Relojfit  extends Reloj {

    public Relojfit(String hora) {
        super(hora);
    }
    
    public int cuentaPasos(int x, int y){
    
        return x*y;
    
    }
    
    public int frecuenciaAleatoria(){
    
        Random rand= new Random();
        return rand.nextInt(100)+50;
    
    }
}
