package com.tsystems.efimova.dao.impl;

import com.tsystems.efimova.dao.interfaces.ItemFeatureDao;
import com.tsystems.efimova.entities.ItemFeatureEntity;

import javax.persistence.EntityManager;

public class ItemFeatureDaoImpl extends GenericDaoImpl<ItemFeatureEntity> implements ItemFeatureDao {

    public ItemFeatureDaoImpl(Class type, EntityManager entityManager) {
        super(type, entityManager);
    }
}
