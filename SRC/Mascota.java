package SRC;

import java.util.Date;

public class Mascota{
String nombre;
String apodo;
String peso;
String edad;
Date FechaNacimiento;
String raza;
String idPersona;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String peso, String edad, Date fechaNacimiento, String raza, String idpersona) {
        this.nombre = nombre;
        this.apodo = apodo;
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

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
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

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
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
        return nombre +","+apodo +","+peso+","+edad+","+FechaNacimiento.toString()+","+raza+","+ idPersona.toString();
    }
}
