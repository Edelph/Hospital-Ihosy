package com.edelph.dao;

public interface daoImpl<T> {
    Boolean update(T t);
    Boolean save(T t);
    Boolean delete(T t);
}
