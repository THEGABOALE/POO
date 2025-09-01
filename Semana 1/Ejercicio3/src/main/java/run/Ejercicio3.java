package run;

public class Ejercicio3 {
    public static void main(String[] args) {
        Libro libro = new Libro();

        libro.titulo = "The Silver Eyes";
        libro.autor = "Scott Cawthon";
        libro.numPaginas = 320;

        System.out.println("Descripcion del libro: " + libro.descripcion());
    }
}
