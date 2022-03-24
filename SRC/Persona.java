/**
 * Clase que modela una persona 
 * @author Luis Emilio Gonzalez Covarrubias
 * @author Luis Mario Escobar Rosales 
 * @author Melissa Vázquez González
 * @author Genaro de Jesús Miranda Martinez
 * @author Maria del Sol Silva Hernández
 * @version 23/03/2022
 */


package SRC;


public class Persona {
    String id;
    String Nombres;
    String ApellidoPaterno;
    String ApellidoMaterno;
    String CURP;
    Direccion direccion;
    String telefono;
    String FechaNacimiento;
    String email;


        /**
        * Constructor por omisión
        */
    public Persona() {
    }

    /**
     * Constructor por parámetros que genera una Persona
     * 
     * @param  id -- id de la persona
     * @param  nombres -- nombres de la persona
     * @param  apellidoPaterno -- Apellido Paterno de la persona
     * @param  apellidoMaterno -- Apellido Materno de la persona
     * @param  CURP -- CURP de la persona
     * @param  direccion -- direccion de la persona
     * @param  telefono -- telefono de la persona
     * @param  fechaNacimiento -- fecha de nacimiento de la persona
     * @param  email -- email de la persona
     */
    public Persona(String id, String nombres, String apellidoPaterno, String apellidoMaterno, String CURP, Direccion direccion, String telefono, String fechaNacimiento, String email) {
        this.id = id;
        Nombres = nombres;
        ApellidoPaterno = apellidoPaterno;
        ApellidoMaterno = apellidoMaterno;
        this.CURP = CURP;
        this.direccion = direccion;
        this.telefono = telefono;
        FechaNacimiento = fechaNacimiento;
        this.email = email;
    }

    /**
    * Método getId que obtiene el ID de la persona.
    * @return id -- regresa el id de la persona. 
    */
    public String getId() {
        return id;
    }

    /**
    * Método setId que define el nuevo id de la persona. 
    * @param  id -- El nuevo id de la persona.
    */
    public void setId(String id) {
        this.id = id;
    }

    /**
    * Método getNombres que obtiene los nombres de la persona.
    * @return nombres -- regresa los nombres de la persona. 
    */
    public String getNombres() {
        return Nombres;
    }

    /**
    * Método setNombres que define los nuevos nombres de la persona. 
    * @param  nombres -- Los nuevos nombres de la persona.
    */
    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    /**
    * Método getApellidoPaterno que obtiene el Apellido paterno de la persona.
    * @return ApellidoPaterno -- regresa el Apellido Paterno de la persona. 
    */
    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    /**
     * Método setApellidoPaterno que define el apellido paterno de la persona. 
     * @param apellidoPaterno -- El Apellido Paterno de la persona. 
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }
    
    /**
    * Método getApellidoMaterno que obtiene el apellido materno de la persona.
    * @return ApellidoMaterno -- regresa el apellido materno de la persona. 
    */
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    /**
     * Método setApellidoMaterno que define el apellido materno de la persona. 
     * @param apellidoMaterno -- El apellido materno de la persona. 
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }


    /**
    * Método getCURP que obtiene el CURP de la persona.
    * @return CURP -- regresa el CURP de la persona. 
    */
    public String getCURP() {
        return CURP;
    }

    /**
    * Método setCURP que define el CURP de la persona.
    * @param CURP -- el nuevo CURP de la persona. 
    */
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    /**
    * Método getDireccion que obtiene la direccion de la persona.
    * @return direccion -- regresa el direccion de la persona. 
    */
    public Direccion getDireccion() {
        return direccion;
    }
    /**
    * Método setDireccion que define la direccion de la persona.
    * @param direccion -- la nueva direccion de la persona. 
    */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
    * Método getTelefono que obtiene el telefono de la persona.
    * @return telefono -- regresa el telefono de la persona. 
    */
    public String getTelefono() {
        return telefono;
    }

    /**
    * Método setTelefono que define el telefono de la persona.
    * @param telefono -- El nuevo teleono de la persona. 
    */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
    * Método getFechaNacimiento que obtiene la fecha de nacimiento de la persona.
    * @return FechaNacimiento -- regresa la fecha de nacimiento de la persona. 
    */
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
    * Método setFechaNacimiento que define la fecha de nacimiento de la persona.
    * @param fechaNacimiento -- La fecha de nacimiento de la persona. 
    */
    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    /**
    * Método getEmail que obtiene el email de la persona.
    * @return email -- regresa el email de la persona. 
    */
    public String getEmail() {
        return email;
    }

    /**
    * Método setEmail que define el email de la persona.
    * @param email -- El nuevo email de la persona. 
    */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
    * Método toString que regresa un string que representa a la persona . 
    * @return modelo de la persona   
    */
    @Override
    public String toString() {
        return id + "," + Nombres + "," + ApellidoPaterno + "," + ApellidoMaterno + "," + CURP + "," +direccion.toString() +","+ telefono + "," +FechaNacimiento+"," + email;
    }
}
