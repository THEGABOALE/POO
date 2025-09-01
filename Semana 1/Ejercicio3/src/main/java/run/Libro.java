package run;

public class Libro {
    String titulo;
    String autor;
    int numPaginas;

    public String descripcion()
    {
        return String.format("Título: %s, Autor: %s, Número de Paginas: %d", titulo, autor, numPaginas);
    }
}
