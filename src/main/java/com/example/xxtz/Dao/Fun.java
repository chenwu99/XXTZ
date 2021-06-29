package com.example.xxtz.Dao;
import java.util.List;

public interface Fun {

    int add(Object obj);

    int update(Object obj);

    int delete(Object key);

    List getByKey(Object key);

    List getAll(Object key);

    List getAll(String attribute, String value);

    long getCount(String attribute, String value);

    boolean exits();
}
