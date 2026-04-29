package Problema2;

public class Prestamo {
    private String fechaSolicitud;
    private String fechaDevolucion;
    private Persona persona;
    private Material[] materiales;
    private int contador;


    public Prestamo(String fechaSolicitud, String fechaDevolucion, Persona persona) {
        this.fechaSolicitud = fechaSolicitud;
        this.fechaDevolucion = fechaDevolucion;
        this.persona = persona;
        this.materiales = new Material[3];
        this.contador = 0;
    }

    public String getFechaSolicitud() {
        return this.fechaSolicitud;
    }

    public String getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public void prestarMaterial(Material m) {
        if (this.contador < 3 && m.prestar()) {
            this.materiales[this.contador++] = m;
        } else {
            System.out.println("No se puede prestar el material");
        }

    }

    public void devolverMaterial(Material m) {
        m.devolver();
    }

    public void mostrarPrestamo() {
        System.out.println("Persona: " + String.valueOf(this.persona));
        System.out.println("Fecha solicitud: " + this.fechaSolicitud);
        System.out.println("Fecha devolucion: " + this.fechaDevolucion);

        for(int i = 0; i < this.contador; ++i) {
            System.out.println(this.materiales[i]);
        }

    }

    public static void main(String[] args) {
        Persona persona = new Persona("Ana Lopez", "INE", "2721230090", "Orizaba Veracruz");
        Material libro = new Libro("L301", "POO", "Esteban M.", 2020, 300, "Ciencia", "Pearson");
        Material revista = new Revista("R701", "Tech", "Mauricio T.", 2022, 50, 10, "Marzo");
        Material audio = new Audiolibro("A051", "Historia", "Rafael Z.", 2019, 0, 120, "Carlos", "MP3");
        Prestamo prestamo = new Prestamo("01/01/2026", "02/01/2026", persona);
        prestamo.prestarMaterial(libro);
        prestamo.prestarMaterial(revista);
        prestamo.prestarMaterial(audio);
        System.out.println("-PERSONA: ");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Identificacion: " + persona.getIdentificacion());
        System.out.println("Celular: " + persona.getCelular());
        System.out.println("Direccion: " + persona.getDireccion());
        System.out.println("\n-PRESTAMO: ");
        System.out.println("Fecha solicitud: " + prestamo.getFechaSolicitud());
        System.out.println("Fecha devolucion: " + prestamo.getFechaDevolucion());
        System.out.println("\n-MATERIALES: ");
        System.out.println("\n-LIBRO-");
        System.out.println("Codigo: " + libro.getCodigo());
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año: " + libro.getAñoPublicacion());
        System.out.println("Paginas: " + libro.getNumeroPaginas());
        System.out.println("Genero: " + ((Libro)libro).getGenero());
        System.out.println("Editorial: " + ((Libro)libro).getEditorial());
        System.out.println("Estado: " + libro.getEstado());
        System.out.println("\n-REVISTA-");
        System.out.println("Codigo: " + revista.getCodigo());
        System.out.println("Titulo: " + revista.getTitulo());
        System.out.println("Autor: " + revista.getAutor());
        System.out.println("Año: " + revista.getAñoPublicacion());
        System.out.println("Paginas: " + revista.getNumeroPaginas());
        System.out.println("Numero edicion: " + ((Revista)revista).getNumeroEdicion());
        System.out.println("Mes publicacion: " + ((Revista)revista).getMesPublicacion());
        System.out.println("Estado: " + revista.getEstado());
        System.out.println("\n-AUDIOLIBRO-");
        System.out.println("Codigo: " + audio.getCodigo());
        System.out.println("Titulo: " + audio.getTitulo());
        System.out.println("Autor: " + audio.getAutor());
        System.out.println("Año: " + audio.getAñoPublicacion());
        System.out.println("Duracion: " + ((Audiolibro)audio).getDuracionMinutos());
        System.out.println("Narrador: " + ((Audiolibro)audio).getNarrador());
        System.out.println("Formato: " + ((Audiolibro)audio).getFormato());
        System.out.println("Estado: " + audio.getEstado());
    }
}

