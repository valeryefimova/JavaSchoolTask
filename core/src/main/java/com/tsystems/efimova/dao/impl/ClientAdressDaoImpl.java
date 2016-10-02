package com.tsystems.efimova.dao.impl;

import com.tsystems.efimova.dao.interfaces.ClientAdressDao;
import com.tsystems.efimova.entities.ClientAdressEntity;

import javax.persistence.EntityManager;

public class ClientAdressDaoImpl extends GenericDaoImpl<ClientAdressEntity> implements ClientAdressDao {

    public ClientAdressDaoImpl(Class type, EntityManager entityManager) {
        super(type, entityManager);
    }
}
