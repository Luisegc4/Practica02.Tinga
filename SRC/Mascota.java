/**
 * Clase que modela una Mascota 
 * @author Luis Emilio Gonzalez Covarrubias
 * @author Luis Mario Escobar Rosales 
 * @author Melissa Vázquez González
 * @author Genaro de Jesús Miranda Martinez
 * @author Maria del Sol Silva Hernández
 * @version 23/03/2022
 */
package SRC;
public class Mascota{
    String nombre;
    String peso;
    String edad;
    String FechaNacimiento;
    String raza;
    String idPersona;
    
    /**
     * Constructor por omisión
     */
    public Mascota() {
    }
    
    /**
     * Constructor por parámetros que genera una Mascota
     * @param String nombre -- nombre de la mascota 
     * @param String peso -- peso de la mascota
     * @param String edad  -- edad de la mascota 
     * @param String fechaNacimiento -- fecha de nacimiento de la mascota 
     * @param String raza -- raza de la mascota 
     */

    public Mascota(String nombre, String peso, String edad, String fechaNacimiento, String raza, String idpersona) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        FechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.idPersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return nombre +","+peso+","+edad+","+FechaNacimiento.toString()+","+raza+","+ idPersona.toString();
    }
}
