package repository;

import entities.Carrera;

import java.util.List;

public interface ICarrera {
    Carrera guardar(Carrera carrera);
    List<Carrera> listar();
    void eliminar(Long id);
    public Carrera buscar(Long id);
}

