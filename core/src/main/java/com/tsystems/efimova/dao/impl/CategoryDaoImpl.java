package com.tsystems.efimova.dao.impl;

import com.tsystems.efimova.dao.interfaces.CategoryDao;
import com.tsystems.efimova.entities.CategoryEntity;

import javax.persistence.EntityManager;

public class CategoryDaoImpl extends GenericDaoImpl<CategoryEntity> implements CategoryDao {

    public CategoryDaoImpl(Class type, EntityManager entityManager) {
        super(type, entityManager);
    }
}
