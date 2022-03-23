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

    public Persona() {
    }

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }
    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + "," + Nombres + "," + ApellidoPaterno + "," + ApellidoMaterno + "," + CURP + "," +direccion.toString() +","+ telefono + "," +FechaNacimiento.toString() + email;
        //TODO: Casteo Fecha a String
    }
}
