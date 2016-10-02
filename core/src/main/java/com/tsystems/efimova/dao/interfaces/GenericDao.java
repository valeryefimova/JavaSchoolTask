package com.tsystems.efimova.dao.interfaces;

import com.tsystems.efimova.dao.DataAccessLayerException;

import java.util.List;

public interface GenericDao<T> {

    void create(T newInstance) throws DataAccessLayerException;

    T read(int id) throws DataAccessLayerException;

    void update(T transientObject) throws DataAccessLayerException;

    void delete(T persistentObject) throws DataAccessLayerException;

    List<T> findAll() throws DataAccessLayerException;
}
