import org.hibernate.Session;

import br.com.fabricio.hibernate.HibernateUtil;

public class test {

	public static void main(String[] args) {
		Session sessao= null;
		try {
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("Conectou!");
		}finally{
			sessao.close();
			System.out.println("Fechou a conexao");
		}
		
	}
	
}
