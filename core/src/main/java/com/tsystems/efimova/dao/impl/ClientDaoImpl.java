package com.tsystems.efimova.dao.impl;

import com.tsystems.efimova.dao.interfaces.ClientDao;
import com.tsystems.efimova.entities.ClientEntity;

import javax.persistence.EntityManager;

public class ClientDaoImpl extends GenericDaoImpl<ClientEntity> implements ClientDao {

    public ClientDaoImpl(Class type, EntityManager entityManager) {
        super(type, entityManager);
    }
}
