package run;

import config.JPAUtil;
import entities.Carrera;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import repository.dao.CarreraDao;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        Carrera carrera = new Carrera();
        carrera.setNombre("Mecatronica");
        carrera.setPrecio(250);

        CarreraDao dao = new CarreraDao(em);

        System.out.println(dao.guardar(carrera));

        List<Carrera> carreras = dao.listar();
        for (Carrera c : carreras) {
            System.out.println(c);
        }
        System.out.println("==================================================");

        dao.eliminar(6L);

        List<Carrera> carreras2 = dao.listar();
        for (Carrera c : carreras2) {
            System.out.println(c);
        }
        System.out.println("==================================================");

        Carrera encontrada = dao.buscar(2L);
        if (encontrada != null) {
            System.out.println("Carrera encontrada: " + encontrada);
        } else {
            System.out.println("Carrera no encontrada");
        }
    }
}
