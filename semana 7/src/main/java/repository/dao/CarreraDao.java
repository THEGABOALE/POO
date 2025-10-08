package repository.dao;

import entities.Carrera;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Id;
import repository.ICarrera;

import java.util.List;

public class CarreraDao implements ICarrera {
    private final EntityManager em;

    public CarreraDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public Carrera guardar(Carrera carrera) {
        if (carrera.getId() == null) {
            em.getTransaction().begin();
            em.persist(carrera);
            em.getTransaction().commit();
            return carrera;
        }
        return em.merge(carrera);
    }

    @Override
    public List<Carrera> listar() {
        List<Carrera> lista = em.createQuery("from Carrera", Carrera.class).getResultList();
        return lista;
    }

    @Override
    public void eliminar(Long id) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Carrera c = em.find(Carrera.class, id);
        if  (id != null) {
            em.remove(c);
        }
        tx.commit();
    }

    @Override
    public Carrera buscar(Long id) {
        return em.find(Carrera.class, id);
    }
}
