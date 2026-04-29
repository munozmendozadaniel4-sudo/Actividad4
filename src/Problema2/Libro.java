package Problema2;

public class Libro extends Material {
    private String genero;
    private String editorial;


    public Libro(String codigo, String titulo, String autor, int añoPublicacion, int numeroPaginas, String genero, String editorial) {
        super(codigo, titulo, autor, añoPublicacion, numeroPaginas);
        this.genero = genero;
        this.editorial = editorial;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", Genero: " + this.genero + ", Editorial: " + this.editorial;
    }
}
