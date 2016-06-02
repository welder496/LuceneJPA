package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

public class LuceneApplication {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("config");
	private static EntityManager em = emf.createEntityManager();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (em != null) {
			System.out.println("Funcionou!!");
		} else {
			System.out.println("Problemas na conexão!!");
		}
		
	}

}
