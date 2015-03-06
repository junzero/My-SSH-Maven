package com.json.s3h4.persist.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T,PK extends Serializable> extends Serializable {

	void save(T model);
	
	void saveOrUpdate(T model);
	
	void delete(PK id);
	
	void delete(T model);
	
	void update(T model);
	
	T get(PK id);
	
	T find(PK id);
	
	List<T> findAll();

}
