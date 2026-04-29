package Problema2;

public class Material {
    protected String codigo;
    protected String titulo;
    protected String autor;
    protected String estado;
    protected int añoPublicacion;
    protected int numeroPaginas;


    public Material(String codigo, String titulo, String autor, int añoPublicacion, int numeroPaginas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.estado = "Disponible";
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public String getEstado() {
        return this.estado;
    }

    public boolean prestar() {
        if (this.estado.equals("Disponible")) {
            this.estado = "Prestado";
            return true;
        } else {
            return false;
        }
    }

    public void devolver() {
        this.estado = "Disponible";
    }

    public String toString() {
        return this.titulo + " (" + this.estado + ")";
    }
}
