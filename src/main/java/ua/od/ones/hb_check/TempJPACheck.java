package ua.od.ones.hb_check;

import ua.od.ones.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TempJPACheck {
    public static void main(String[] args) {
        populateRoles();
    }

    private static void populateRoles() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("periodicals");

        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        Role admin = new Role();
        admin.setName("Admin");
        entityManager.persist(admin);

        Role user = new Role();
        user.setName("User");
        entityManager.persist(user);

        transaction.commit();

        entityManager.close();
        factory.close();
    }
}
