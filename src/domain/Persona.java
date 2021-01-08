
package domain;

/**
 *
 * @author AngeloCarrillo
 */
public class Persona {
    
    private int idPersona;
    private String nombre;
    private static int contadorPersona;
    
    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementa el valor del contador
        Persona.contadorPersona++;
        //Asingnar valor al id
        this.idPersona = contadorPersona;
        
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}
