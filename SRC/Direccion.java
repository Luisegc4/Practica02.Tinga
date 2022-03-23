package SRC;

public class Direccion {
    String estado;
    String calle;
    String numero;
    String CodigoPostal;

    public Direccion() {
    }

    public Direccion(String estado, String calle, String numero, String codigoPostal) {
        this.estado = estado;
        this.calle = calle;
        this.numero = numero;
        CodigoPostal = codigoPostal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }
}
