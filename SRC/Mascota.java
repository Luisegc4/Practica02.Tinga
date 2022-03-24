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

   /**
    * Método getNombre que obtiene el nombre de la mascota.
    * @return nombre -- regresa el nombre de la mascota. 
    */
    public String getNombre() {
        return nombre;
    }
    
   /**
    * Método setNombre que define el nuevo nombre de la mascota. 
    * @param String nombre -- El nuevo nombre de la mascota.
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * Método getPeso que obtiene el peso de la mascota.
    * @return String peso -- regresa el peso de la mascota. 
    */
    public String getPeso() {
        return peso;
    }

    /**
    * Método setPeso que modifica   el nuevo peso de la mascota. 
    * @param String peso -- el nuevo peso de la mascota 
    */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    
   /**
    * Método getEdad que obtiene la edad de la mascota.
    * @return String edad -- regresa la edad  de la mascota. 
    */  
    public String getEdad() {
        return edad;
    }

   /**
    * Método setEdad que modifica  la edad  de la mascota. 
    * @param String edad -- modifica la edad de la mascota 
    */
    public void setEdad(String edad) {
        this.edad = edad;
    }

   /**
    * Método getFechaNacimiento que obtiene la fecha de nacimiento  de la mascota.
    * @return String edad -- regresa la edad  de la mascota. 
    */      
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    
   /**
    * Método setFechaNacimiento que modifica  la fecha de nacimiento  de la mascota. 
    * @param FechaNacimiento fechaNacimiento -- modifica la fecha de nacimiento  de la mascota 
    */
    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
    
   /**
    * Método getRaza que obtiene la raza  de la mascota.
    * @return String raza -- regresa la edad  de la mascota. 
    */  
    public String getRaza() {
        return raza;
    }

   /**
    * Método setRaza que modifica  la raza de   de la mascota. 
    * @param String raza -- modifica la raza de la mascota   de la mascota 
    */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    
   /**
    * Método getIdPersona que obtiene  el identificador del dueño   de la mascota.
    * @return String IdPersona -- regresa el identificador del dueño   de la mascota. 
    */ 
    public String getIdPersona() {
        return idPersona;
    }

    
   /**
    * Método setIdPersona que modifica  el Id del dueño de la mascota. 
    * @param String idPersona -- modifica el identificador del dueño de la mascota   
    */
    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

   /**
    * Método toString que regresa un string que representa a la mascota . 
    * @return  String modelo de la mascota   
    */
    @Override
    public String toString() {
        return nombre +","+peso+","+edad+","+FechaNacimiento.toString()+","+raza+","+ idPersona.toString();
    }
}
