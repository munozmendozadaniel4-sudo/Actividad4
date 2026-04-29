package Problema2;

public class Revista extends Material {
    private int numeroEdicion;
    private String mesPublicacion;


    public Revista(String codigo, String titulo, String autor, int añoPublicacion, int numeroPaginas, int numeroEdicion, String mesPublicacion) {
        super(codigo, titulo, autor, añoPublicacion, numeroPaginas);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    public int getNumeroEdicion() {
        return this.numeroEdicion;
    }

    public String getMesPublicacion() {
        return this.mesPublicacion;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", Edicion: " + this.numeroEdicion + ", Mes: " + this.mesPublicacion;
    }
}

