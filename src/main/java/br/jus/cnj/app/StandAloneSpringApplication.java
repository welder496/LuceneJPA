package br.jus.cnj.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import br.jus.cnj.model.Jogador;

@Component
public class StandAloneSpringApplication {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context-application.xml");
		EntityManagerFactory emf = context.getBean(EntityManagerFactory.class);
		EntityManager em = emf.createEntityManager();
			if (em != null){
				System.out.println("Funcionou o entitymanagerFactory");
				em.getTransaction().begin();
				Jogador jog = new Jogador();
				jog.setAtual(10.0F);
				jog.setNome("ANDRADE");
				jog.setTime("Não tem!!");
				em.persist(jog);
				em.getTransaction().commit();
			} else {
			System.out.println("Bean não foi criado!!");
		}
	}


	
}
