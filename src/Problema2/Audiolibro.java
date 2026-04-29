package Problema2;

public class Audiolibro extends Material {
    private int duracionMinutos;
    private String narrador;
    private String formato;


    public Audiolibro(String codigo, String titulo, String autor, int añoPublicacion, int numeroPaginas, int duracionMinutos, String narrador, String formato) {
        super(codigo, titulo, autor, añoPublicacion, numeroPaginas);
        this.duracionMinutos = duracionMinutos;
        this.narrador = narrador;
        this.formato = formato;
    }

    public int getDuracionMinutos() {
        return this.duracionMinutos;
    }

    public String getNarrador() {
        return this.narrador;
    }

    public String getFormato() {
        return this.formato;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", Duracion: " + this.duracionMinutos + ", Narrador: " + this.narrador + ", Formato: " + this.formato;
    }
}
