package Problema1;

public class Cliente {
    private String nombre;
    private String celular;
    private String identificacion;

    public Cliente(String nombre, String celular, String identificacion) {
        this.nombre = nombre;
        this.celular = celular;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCelular() {
        return this.celular;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public String toString() {
        return this.nombre;
    }
}

