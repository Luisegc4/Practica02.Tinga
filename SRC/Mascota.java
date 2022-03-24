package SRC;

//hola
public class Mascota{
    String nombre;
    String peso;
    String edad;
    String FechaNacimiento;
    String raza;
    String idPersona;

    public Mascota() {
    }

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
