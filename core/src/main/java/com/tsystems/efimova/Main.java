package com.tsystems.efimova;

import com.tsystems.efimova.dao.DataAccessLayerException;
import com.tsystems.efimova.dao.EntityManagerUtil;
import com.tsystems.efimova.dao.impl.CategoryDaoImpl;
import com.tsystems.efimova.dao.interfaces.CategoryDao;
import com.tsystems.efimova.entities.CategoryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {

    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.createEntityManager();
        EntityTransaction trx = em.getTransaction();
        try {
            trx.begin();
            CategoryDao category = new CategoryDaoImpl(CategoryEntity.class, em);
            category.create(new CategoryEntity("flower"));
            trx.commit();
        } catch (DataAccessLayerException e) {
            e.printStackTrace();
        } finally
        {
            if (trx.isActive())
                trx.rollback();
        }
    }
}
