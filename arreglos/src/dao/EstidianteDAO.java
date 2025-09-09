package dao;

import modelos.Estudiante;

import java.util.ArrayList;

public class EstidianteDAO {
    private ArrayList<Estudiante> listado;

    public EstidianteDAO() {
        this.listado = new ArrayList<>();
    }

    //agregar
    public void agregarEstudiante(Estudiante estudiante) {
        this.listado.add(estudiante);
    }

    //eliminar
    public void eliminarEstudiante(Estudiante estudiante) {
        this.listado.remove(estudiante);
    }

    //buscar
    public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante estudiante : listado) {
            if (estudiante.getNombre().equals(nombre)) {
                return estudiante;
            }
        }
        return null;
    }

    //editar
    public void editarEstudiante(Estudiante estudiante) {
        for (Estudiante est : listado) {
            if (est.getNombre().equals(estudiante.getNombre())) {
                est.setEdad(estudiante.getEdad());
            }
        }
    }

    //Listar
    public ArrayList<Estudiante> mostrar() {
        return this.listado;
    }
}
