package com.tsystems.efimova.dao.impl;

import com.tsystems.efimova.dao.interfaces.ItemDao;
import com.tsystems.efimova.entities.ItemEntity;

import javax.persistence.EntityManager;

public class ItemDaoImpl extends GenericDaoImpl<ItemEntity> implements ItemDao {

    public ItemDaoImpl(Class type, EntityManager entityManager) {
        super(type, entityManager);
    }
}
