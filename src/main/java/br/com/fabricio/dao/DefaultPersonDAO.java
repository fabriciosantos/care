package br.com.fabricio.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fabricio.model.Person;
import br.com.fabricio.util.JPAUtil;

public class DefaultPersonDAO implements PersonDAO{

	
	private static EntityManager entityManager = new JPAUtil().getEntityManager();
	 
		
	public void create(Person person) throws Exception {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(person);
			entityManager.getTransaction().commit();
			entityManager.close();
		} catch (RuntimeException e) {
			throw new Exception(e);
		}
	}

	public Person find(int id) throws Exception {
		try {
			Query query = entityManager.createQuery("select p from Person p where p.id:id");
			query.setParameter("id", id);
			Person person = (Person) query.getSingleResult();
			return person;
		} catch (RuntimeException e) {
			throw new Exception(e);
		}
	}

	public void update(Person person) throws Exception {
		try{
			entityManager.getTransaction().begin();
			entityManager.find(Person.class, person.getId());
			entityManager.merge(person);
			entityManager.getTransaction().commit();
			entityManager.close();
		}catch(RuntimeException e){
			throw new Exception(e);
		}
	}

	public void delete(int id) throws Exception {
		try{
			entityManager.getTransaction().begin();
			Person person = entityManager.find(Person.class, id);
			person.setEnable(false);
			entityManager.merge(person);
			entityManager.getTransaction().commit();
			entityManager.close();
		}catch(RuntimeException e){
			throw new Exception(e);
		}
	}
}
