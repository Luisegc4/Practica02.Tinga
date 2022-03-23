package SRC;

public class Veterinaria {

    String nombre;
    String consultorios;
    String apartado;
    String telefono;
    String horario;
    Direccion direccion;

    public Veterinaria(){
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

    public String getHorario() {
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

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
