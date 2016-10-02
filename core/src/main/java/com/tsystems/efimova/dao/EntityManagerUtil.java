package com.tsystems.efimova.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
    private static EntityManagerFactory entityManagerFactory = null;


    private EntityManagerUtil() {
    }

    public static EntityManagerFactory buildSessionFactory() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
        entityManagerFactory = Persistence.createEntityManagerFactory("shop");
        return entityManagerFactory;
    }

    public static EntityManagerFactory buildIfNeeded() {
        if (entityManagerFactory != null) {
            return entityManagerFactory;
        }
        entityManagerFactory = Persistence.createEntityManagerFactory("shop");
        return entityManagerFactory;
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static EntityManager createEntityManager() {
        buildIfNeeded();
        return entityManagerFactory.createEntityManager();
    }

    public static void closeFactory() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

    public static void close(EntityManager entityManager) {
        if (entityManager != null) {
            entityManager.close();
        }
    }
}
