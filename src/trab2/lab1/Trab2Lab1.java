
package trab2.lab1;


public class Trab2Lab1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Relojfit mirelojfit= new Relojfit("12:00 pm");
        
        Persona persona= new Persona (" Carlos ", mirelojfit);
        
        persona.verhora();
        
        int pasos=mirelojfit.cuentaPasos(5,10);
        System.out.println(" Carlos ha dado "+ pasos + "pasos");
        
        int frecuencia = mirelojfit.frecuenciaAleatoria();
        
        System.out.println("La frecuencia aleatoria es: " + frecuencia);
        
    }
    
}
