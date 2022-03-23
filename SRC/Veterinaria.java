package SRC;

public class Veterinaria {

    String nombre;
    String consultorios; //TODO: Poner menor o igual a 4
    String apartado;
    String telefono;
    Horario horario;
    Direccion direccion;

    public Veterinaria(){
    }

    public Veterinaria(String nombre, String consultorios, String apartado, String telefono, Horario horario, Direccion direccion) {
        this.nombre = nombre;
        this.consultorios = consultorios;
        this.apartado = apartado;
        this.telefono = telefono;
        this.horario = horario;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getConsultorios() {
        return consultorios;
    }

    public String getApartado() {
        return apartado;
    }

    public String getTelefono() {
        return telefono;
    }

    public Horario getHorario() {
        return horario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombres(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setConsultorio(String consultorio) {
        this.consultorios = consultorio;
    }

    public void setApartado(String apartado) {
        this.apartado = apartado;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + "," +  consultorios + "," + apartado + "," + telefono + "," + horario.toString() +","+direccion.toString();
    }
}
