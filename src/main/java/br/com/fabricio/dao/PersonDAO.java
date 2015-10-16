package br.com.fabricio.dao;

import br.com.fabricio.model.Person;

public interface PersonDAO {
	
	void create(Person person) throws Exception;
	
	Person find(int id)throws Exception;
	
	void update(Person person) throws Exception;
	
	void delete(int id) throws Exception;
}
