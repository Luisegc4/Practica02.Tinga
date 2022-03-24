/**
 * Clase que modela una Direccion 
 * @author Luis Emilio Gonzalez Covarrubias
 * @author Luis Mario Escobar Rosales 
 * @author Melissa Vázquez González
 * @author Genaro de Jesús Miranda Martinez
 * @author Maria del Sol Silva Hernández
 * @version 23/03/2022
 */


package SRC;
public class Direccion {
    String estado;
    String calle;
    String numero;
    String CodigoPostal;

   /**
    * Constructor por omisión
    */
    public Direccion() {
    }


    /**
     * Constructor por parámetros que genera una direccion
     * @param  estado -- nombre del estado 
     * @param  calle -- nombre de la calle 
     * @param  numero  -- numero de la direccion 
     * @param  codigoPostal -- codigo postal de la direccion 
     */
    public Direccion(String estado, String calle, String numero, String codigoPostal) {
        this.estado = estado;
        this.calle = calle;
        this.numero = numero;
        CodigoPostal = codigoPostal;
    }


   /**
    * Método getEstado obtiene el estado(lugar) de la direccion 
    * @return estado -- regresa el estado de la direccion . 
    */
    public String getEstado() {
        return estado;
    }

   /**
    * Método setEstado que define el nuevo estado(lugar) de la direccion. 
    * @param  nombre -- El nuevo nombre de la veterinaria.
    */
    public void setEstado(String estado) {
        this.estado = estado;
    }

   /**
    * Método getCalle obtiene la calle  de la direccion 
    * @return calle -- regresa la calle de la direccion . 
    */
    public String getCalle() {
        return calle;
    }

   /**
    * Método setCalle que define la nueva  calle  de la direccion. 
    * @param  calle -- La nueva calle de la direccion .
    */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    
   /**
    * Método getNumero obtiene el numero  de la direccion 
    * @return getNumero -- regresa el numero  de la direccion . 
    */
    
    public String getNumero() {
        return numero;
    }
    
   /**
    * Método setNumero que define el nuevo numero  de la direccion. 
    * @param  numero -- El nuevo numero de la direccion .
    */
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }
    
   /**
    * Método setCodigoPostal que define el nuevo codigo postal   de la direccion. 
    * @param  codigopostal -- El nuevo codigo postal  de la direccion .
    */
    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }
    
   /**
    * Método toString que regresa un string que representa la direccion  . 
    * @return modelo string de la direccion 
    */
    @Override
    public String toString() {
        return estado + "," + calle +","+numero +","+CodigoPostal;
    }
}
