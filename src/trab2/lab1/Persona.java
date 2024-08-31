
package trab2.lab1;


public class Persona {
    
    private String nombre;
    private Reloj reloj;

    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }
    
    
    
   public void verhora(){
   
       System.out.println(nombre+ "mira su reloj");
       reloj.mostrarHora();
   
   }
    
}
