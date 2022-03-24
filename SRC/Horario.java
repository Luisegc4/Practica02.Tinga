/**
 * Clase que representa   un Horario 
 * @author Luis Emilio Gonzalez Covarrubias
 * @author Luis Mario Escobar Rosales 
 * @author Melissa Vázquez González
 * @author Genaro de Jesús Miranda Martinez
 * @author Maria del Sol Silva Hernández
 * @version 23/03/2022
 */
package SRC;
public class Horario {
    String HoraInicio;
    String HoraFin;
    
    /**
     * Constructor por parámetros que genera un horario
     * @param  horaInicio -- hora de inicio 
     * @param  horaFin -- hora de finalizacion 
     */
    public Horario(String horaInicio, String horaFin) {
        HoraInicio = horaInicio;
        HoraFin = horaFin;
    }
    
   /**
    * Constructor por omisión
    */
    public Horario() {
    }
    
   /**
    * Método getHoraInicio obtiene la hora de inicio 
    * @return HoraInicio -- regresa la hora de inicio del horario . 
    */
    public String getHoraInicio() {
        return HoraInicio;
    }
 
   /**
    * Método setHoraInicio define la nueva  hora de inicio 
    * @param HoraInicio -- actualiza la hora de inicio del horario . 
    */
    public void setHoraInicio(String horaInicio) {
        HoraInicio = horaInicio;
    }

   /**
    * Método getHoraoFin obtiene la hora de finalizacion 
    * @return HoraFin -- regresa la hora de finalizacion del horario. 
    */
    public String getHoraFin() {
        return HoraFin;
    }

    
    /**
    * Método setHoraFin define la nueva  hora de finalizacion 
    * @param HoraFIn -- actualiza la hora de finalizacion del horario . 
    */
    public void setHoraFin(String horaFin) {
        HoraFin = horaFin;
    }
    
   /**
    * Método toString que regresa un string que representa el horario  . 
    * @return modelo string del horario
    */
    @Override
    public String toString() {
        return HoraFin +","+ HoraFin;
    }
}
