package br.com.fabricio.dao;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fabricio.model.Person;
import br.com.fabricio.util.JPAUtil;

public class DefaultPersonDAO implements PersonDAO{


private static Logger logger = LoggerFactory.getLogger(Person.class);

	public void create(Person person) throws Exception {
		try {
			EntityManager entityManager = new JPAUtil().getEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(person);
			entityManager.getTransaction().commit();
			entityManager.close();
			logger.debug("Create Person successfully.");
		} catch (RuntimeException e) {
			logger.error("Create Person error.");
			throw new Exception(e.getMessage());
		}
	}

	public Person find(int id) throws Exception {
		try {
			EntityManager entityManager = new JPAUtil().getEntityManager();
			entityManager.getTransaction().begin();
			Person person = entityManager.find(Person.class, id);
			entityManager.close();
			logger.debug("Find Person successfully.");
			return person;
		} catch (RuntimeException e) {
			logger.error("Find Person error.");
			throw new Exception(e.getMessage());
		}
	}

	public void update(Person person) throws Exception {
		try{
			EntityManager entityManager = new JPAUtil().getEntityManager();
			entityManager.getTransaction().begin();
			entityManager.find(Person.class, person.getId());
			entityManager.merge(person);
			entityManager.getTransaction().commit();
			entityManager.close();
			logger.debug("Update Person successfully.");
		}catch(RuntimeException e){
			logger.error("Delete Person error.");
			throw new Exception(e.getMessage());
		}
	}

	public void delete(int id) throws Exception {
		try{
			EntityManager entityManager = new JPAUtil().getEntityManager();
			entityManager.getTransaction().begin();
			Person person = entityManager.find(Person.class, id);
			person.setEnable(false);
			entityManager.merge(person);
			entityManager.getTransaction().commit();
			entityManager.close();
			logger.debug("Delete Person successfully.");
		}catch(RuntimeException e){
			logger.error("Delete Perons error.");
			throw new Exception(e.getMessage());
		}
	}
}
