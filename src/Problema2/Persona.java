package Problema2;

public class Persona {
    private String nombre;
    private String identificacion;
    private String celular;
    private String direccion;

    public Persona(String nombre, String identificacion, String celular, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.celular = celular;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public String getCelular() {
        return this.celular;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String toString() {
        return this.nombre + " (" + this.identificacion + ")";
    }
}
