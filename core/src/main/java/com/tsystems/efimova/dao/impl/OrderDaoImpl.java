package com.tsystems.efimova.dao.impl;

import com.tsystems.efimova.dao.interfaces.OrderDao;
import com.tsystems.efimova.entities.OrderEntity;

import javax.persistence.EntityManager;

public class OrderDaoImpl extends GenericDaoImpl<OrderEntity> implements OrderDao {

    public OrderDaoImpl(Class type, EntityManager entityManager) {
        super(type, entityManager);
    }
}
