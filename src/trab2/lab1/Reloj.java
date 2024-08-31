
package trab2.lab1;


public class Reloj {
    
    private String hora;

    public Reloj(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public void  mostrarHora (){
    
        System.out.println("la hora actual es:"+hora);
    }
    
}
