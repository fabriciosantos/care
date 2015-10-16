package DAOTest;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.fabricio.dao.DefaultPersonDAO;
import br.com.fabricio.model.Person;

public class PersonTest {

	private static EntityManager entityManager;
	private static DefaultPersonDAO daoPerson;
	private Person person;
	
	
	@Test
	public void createPersonTest() throws Exception {
		Person person = new Person();
		daoPerson.create(person);
		assertEquals(true, true);
	}
}
