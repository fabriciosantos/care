import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.fabricio.dao.DefaultPersonDAO;
import br.com.fabricio.dao.PersonDAO;
import br.com.fabricio.model.Person;
import br.com.fabricio.util.JPAUtil;

public class test {
	
	private static PersonDAO personDAO;
	private static DefaultPersonDAO personDao;
	
	public static void main(String[] args) throws Exception {
		 personDao = new DefaultPersonDAO();
	
		try {
						
			Person p = new Person();
			p.setName("fabricio");
			p.setEmail("email");
			p.setEnable(true);
			p.setLogin("login");
			p.setPassword("password");
			
			personDao.create(p);
			//Person person = personDAO.find(p.getId());
			p.setName("null");
			personDao.update(p);
			personDao.delete(p.getId());
			//System.out.println(person.getName());
			
			
		}catch (Exception e) {
			throw new Exception(e);
		}
	}
	
}
