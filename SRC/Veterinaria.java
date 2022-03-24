/**
 * Clase que modela una Veterinaria 
 * @author Luis Emilio Gonzalez Covarrubias
 * @author Luis Mario Escobar Rosales 
 * @author Melissa Vázquez González
 * @author Genaro de Jesús Miranda Martinez
 * @author Maria del Sol Silva Hernández
 * @version 23/03/2022
 */
package SRC;

public class Veterinaria {

    String nombre;
    String consultorios; //TODO: Poner menor o igual a 4
    String apartado;
    String telefono;
    Horario horario;
    Direccion direccion;

    /**
     * Constructor por omisión
     */
    public Veterinaria(){
    }
    
    
    /**
     * Constructor por parámetros que genera una Mascota
     * @param  nombre -- nombre de la veterinaria 
     * @param  consultorios -- consultorios de la veterinaria 
     * @param  apartado  -- apartado para poder cuidar  a la mascota 
     * @param  telefono -- telefono de la veterinaria 
     * @param  horario -- horario de la veterinaria
     * @param  direccion -- direccion de la veterinaria 
     */

    public Veterinaria(String nombre, String consultorios, String apartado, String telefono, Horario horario, Direccion direccion) {
        this.nombre = nombre;
        this.consultorios = consultorios;
        this.apartado = apartado;
        this.telefono = telefono;
        this.horario = horario;
        this.direccion = direccion;
    }

   /**
    * Método getNombre obtiene el nombre de la veterinaria 
    * @return nombre -- regresa el nombre de la veterinaria . 
    */
    public String getNombre() {
        return nombre;
    }

   /**
    * Método getConsultorios obtiene los consultorios de la veterinaria 
    * @return consultorios -- regresa los consultorios  de la veterinaria . 
    */
    public String getConsultorios() {
        return consultorios;
    }

   /**
    * Método getApartado obtiene el apartado de la veterinaria 
    * @return apartados -- regresa el apartado  de la veterinaria . 
    */    
    public String getApartado() {
        return apartado;
    }

   /**
    * Método getTelefono obtiene el telefono de la veterinaria 
    * @return telefono -- regresa el telefono  de la veterinaria . 
    */  
    public String getTelefono() {
        return telefono;
    }
    
   /**
    * Método getHorario obtiene el horario de la veterinaria 
    * @return horario -- regresa el horraio  de la veterinaria . 
    */ 
    public Horario getHorario() {
        return horario;
    }

   /**
    * Método getDireccion obtiene la direccion de la veterinaria 
    * @return direccion -- regresa la direccion de la veterinaria . 
    */ 
    public Direccion getDireccion() {
        return direccion;
    }
    
   /**
    * Método setNombres que define el nuevo nombre de la veterinaria. 
    * @param  nombre -- El nuevo nombre de la veterinaria.
    */
    public void setNombres(String nombre) {
        this.nombre = nombre;
    }

   /**
    * Método setTelefono que define el nuevo telefono de la veterinaria. 
    * @param  telefono -- El nuevo telefono de la veterinaria.
    */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   /**
    * Método setConsultorio que define el nuevo consultario de la veterinaria. 
    * @param  consultorio -- El nuevo consultorio de la veterinaria.
    */
    public void setConsultorio(String consultorio) {
        this.consultorios = consultorio;
    }

    /**
    * Método setApartado que define el nuevo apartado de la veterinaria. 
    * @param  apartado -- El nuevo apartado de la veterinaria.
    */
    public void setApartado(String apartado) {
        this.apartado = apartado;
    }

   /**
    * Método setHorario que define el nuevo horario de la veterinaria. 
    * @param  horario -- El nuevo horario de la veterinaria.
    */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    /**
    * Método setDireccion que define la nueva direccion de la veterinaria. 
    * @param  direccion --La nueva  direccion  de la veterinaria.
    */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    /**
    * Método toString que regresa un string que representa a la veterinaria  . 
    * @return modelo de la veterinaria 
    */
    @Override
    public String toString() {
        return nombre + "," +  consultorios + "," + apartado + "," + telefono + "," + horario.toString() +","+direccion.toString();
    }
}
