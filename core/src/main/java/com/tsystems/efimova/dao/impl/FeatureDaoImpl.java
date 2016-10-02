package com.tsystems.efimova.dao.impl;

import com.tsystems.efimova.dao.interfaces.FeatureDao;
import com.tsystems.efimova.entities.FeatureEntity;

import javax.persistence.EntityManager;

public class FeatureDaoImpl extends GenericDaoImpl<FeatureEntity> implements FeatureDao {

    public FeatureDaoImpl(Class type, EntityManager entityManager) {
        super(type, entityManager);
    }
}
